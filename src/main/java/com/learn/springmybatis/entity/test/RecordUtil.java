package com.learn.springmybatis.entity.test;//package com.sw.celebration.utils;
//
//import org.bytedeco.ffmpeg.global.avutil;
//import org.bytedeco.javacv.Java2DFrameConverter;
//
//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//
///**
// * @author lvz
// * @date 2021/3/31
// */
//public class RecordUtil {
//
//
//    /**
//     * 按帧录制视频
//     *
//     * @param inputFile-该地址可以是网络直播/录播地址，也可以是远程/本地文件路径
//     * @param outputFile                              -该地址只能是文件地址，如果使用该方法推送流媒体服务器会报错，原因是没有设置编码格式
//     * @throws FrameGrabber.Exception
//     * @throws FrameRecorder.Exception
//     * @throws org.bytedeco.javacv.FrameRecorder.Exception
//     */
//    public void frameRecordImage(String inputFile, String outputFile, String imgMat, String frameRate,String imageName) throws Exception {
//        avutil.av_log_set_level(avutil.AV_LOG_FATAL);
//        // 获取视频源
////        FFmpegFrameGrabber grabber = new FFmpegFrameGrabber(inputFile);
//        MyFFmpegFrameGrabber grabber = new MyFFmpegFrameGrabber(inputFile);
//        grabber.setOption("rtsp_transport", "tcp");
//        grabber.setImageWidth(640);
//        grabber.setImageHeight(360);
//        grabber.setTimeout(3000);
//        grabber.setFrameRate(frameRate);
//        grabber.setVideoBitrate(3000000);
//
//        Java2DFrameConverter converter = new Java2DFrameConverter();
//        recordByFrame(grabber, converter, outputFile, imgMat, imageName);
//    }
//
//    private void recordByFrame(MyFFmpegFrameGrabber grabber, Java2DFrameConverter converter, String
//            outputFile, String imgMat,String imageName) throws Exception {
//        try {//建议在线程中使用该方法
//            log.info("the code {} grab start");
//            grabber.start();
//            imageByframe(grabber, converter, outputFile, imgMat, imageName);
//            grabber.stop();
//            log.info("the code {} grab stop");
//        } finally {
//            if (grabber != null) {
//                grabber.stop();
//                log.info("the code {} grab stop");
//            }
//        }
//    }
//
//    private void imageByframe(MyFFmpegFrameGrabber grabber, Java2DFrameConverter converter, String outputFile, String
//            imgMat, String imageName) throws IOException {
//        Frame frame = grabber.grabImage();
//        BufferedImage bi = converter.convert(frame);
//        // 每个frameRate帧进行一次抓取
//        outputFile = outputFile + SLASH + imageName + Field.DOT + imgMat;
//        ImageIO.write(bi, imgMat, new File(outputFile));
//    }
//
//    public static void main(String[] args) {
//        RecordUtil recordUtil = new RecordUtil();
//        recordUtil.frameRecordImage("rtmp流地址", "图片输出路径", "图片后缀", "帧率", "图片名");
//    }
//}
