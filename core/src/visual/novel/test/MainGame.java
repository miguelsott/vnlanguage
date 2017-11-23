package visual.novel.test;

import Model.Jogo;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import visual.novel.test.vnlanguage.VNLanguage;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
        Jogo jogo;
	VNLanguage vn;
        
	@Override
	public void create () {
            batch = new SpriteBatch();
            jogo = new Jogo();
            vn = new VNLanguage();
            
            try {
                jogo = vn.run();
            } catch (IOException ex) {
                Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            String caminhoDasIndias = jogo.getPersonagens().get(0).getMap().get("x").toString().replace("\"", "");
            img = new Texture(caminhoDasIndias);
	}

	@Override
	public void render () {
            Gdx.gl.glClearColor(1, 0, 0, 1);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            batch.begin();
            batch.draw(img, 0, 0);
            batch.end();
	}
	
	@Override
	public void dispose () {
            batch.dispose();
            img.dispose();
        }
}
