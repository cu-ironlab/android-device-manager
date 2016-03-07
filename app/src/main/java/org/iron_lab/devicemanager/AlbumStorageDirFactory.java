package org.iron_lab.devicemanager;

import java.io.File;
abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}
