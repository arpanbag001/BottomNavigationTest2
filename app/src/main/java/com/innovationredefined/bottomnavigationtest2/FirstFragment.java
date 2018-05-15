package com.innovationredefined.bottomnavigationtest2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
View firstFragmentRootView;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        firstFragmentRootView = inflater.inflate(R.layout.fragment_first, container, false);
        TextView textView = firstFragmentRootView.findViewById(R.id.textview);
        textView.setText("Music is an art form and cultural activity whose medium is sound organized in time. The common elements of music are pitch (which governs melody and harmony), rhythm (and its associated concepts tempo, meter, and articulation), dynamics (loudness and softness), and the sonic qualities of timbre and texture (which are sometimes termed the \"color\" of a musical sound). Different styles or types of music may emphasize, de-emphasize or omit some of these elements. Music is performed with a vast range of instruments and vocal techniques ranging from singing to rapping; there are solely instrumental pieces, solely vocal pieces (such as songs without instrumental accompaniment) and pieces that combine singing and instruments. The word derives from Greek μουσική (mousike; \"art of the Muses\").[1] See glossary of musical terminology.\n" +
                "\n" +
                "In its most general form, the activities describing music as an art form or cultural activity include the creation of works of music (songs, tunes, symphonies, and so on), the criticism of music, the study of the history of music, and the aesthetic examination of music. Ancient Greek and Indian philosophers defined music as tones ordered horizontally as melodies and vertically as harmonies. Common sayings such as \"the harmony of the spheres\" and \"it is music to my ears\" point to the notion that music is often ordered and pleasant to listen to. However, 20th-century composer John Cage thought that any sound can be music, saying, for example, \"There is no noise, only sound.\"[2]\n" +
                "\n" +
                "The creation, performance, significance, and even the definition of music vary according to culture and social context. Indeed, throughout history, some new forms or styles of music have been criticized as \"not being music\", including Beethoven's Grosse Fuge string quartet in 1825,[3] early jazz in the beginning of the 1900s[4] and hardcore punk in the 1980s.[5] There are many types of music, including popular music, traditional music, art music, music written for religious ceremonies and work songs such as chanteys. Music ranges from strictly organized compositions–such as Classical music symphonies from the 1700s and 1800s, through to spontaneously played improvisational music such as jazz, and avant-garde styles of chance-based contemporary music from the 20th and 21st centuries.\n" +
                "\n" +
                "Music can be divided into genres (e.g., country music) and genres can be further divided into subgenres (e.g., country blues and pop country are two of the many country subgenres), although the dividing lines and relationships between music genres are often subtle, sometimes open to personal interpretation, and occasionally controversial. For example, it can be hard to draw the line between some early 1980s hard rock and heavy metal. Within the arts, music may be classified as a performing art, a fine art or as an auditory art. Music may be played or sung and heard live at a rock concert or orchestra performance, heard live as part of a dramatic work (a music theater show or opera), or it may be recorded and listened to on a radio, MP3 player, CD player, smartphone or as film score or TV show.\n" +
                "\n" +
                "In many cultures, music is an important part of people's way of life, as it plays a key role in religious rituals, rite of passage ceremonies (e.g., graduation and marriage), social activities (e.g., dancing) and cultural activities ranging from amateur karaoke singing to playing in an amateur funk band or singing in a community choir. People may make music as a hobby, like a teen playing cello in a youth orchestra, or work as a professional musician or singer. The music industry includes the individuals who create new songs and musical pieces (such as songwriters and composers), individuals who perform music (which include orchestra, jazz band and rock band musicians, singers and conductors), individuals who record music (music producers and sound engineers), individuals who organize concert tours, and individuals who sell recordings and sheet music and scores to customers.");
        return firstFragmentRootView;
    }

}
