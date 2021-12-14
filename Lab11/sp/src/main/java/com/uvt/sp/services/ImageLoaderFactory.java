package com.uvt.sp.services;

public class ImageLoaderFactory {

    public static ImageLoader create(String name){
        if(name.endsWith("jpg")) {
            return (new JPGImageLoader(name));
        }
        else {
            return (new BMPImageLoader(name));
        }
    }
}
