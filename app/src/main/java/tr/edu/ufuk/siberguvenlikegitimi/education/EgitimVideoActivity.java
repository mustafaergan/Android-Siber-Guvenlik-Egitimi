package tr.edu.ufuk.siberguvenlikegitimi.education;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import tr.edu.ufuk.siberguvenlikegitimi.R;

public class EgitimVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egitim_video);

        String videoPath = "android.resource://" + getPackageName() + "/raw/egitimvideo";
        Uri uri= Uri.parse(videoPath);
        VideoView video=(VideoView)findViewById(R.id.egitimVideo);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(video);
        video.setMediaController(mediaController);
        video.setVideoURI(uri);
        video.start();
    }

}
