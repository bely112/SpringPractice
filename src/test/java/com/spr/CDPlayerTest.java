//package com.spr;
//
//import static org.junit.Assert.*;
//
//import com.spr.spr4e.ch2.CDPlayerConfig;
//import com.spr.spr4e.ch2.CompactDisc;
//import com.spr.spr4e.ch2.MediaPlayer;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDPlayerConfig.class)
//public class CDPlayerTest {
//
//    @Autowired
//    private MediaPlayer player;
//
//    @Autowired
//    private CompactDisc cd;
//
//    @Test
//    public void cdShouldNotBeNull() {
//        assertNotNull(cd);
//    }
//
//    @Test
//    public void play() {
//        player.play();
//    }
//}
