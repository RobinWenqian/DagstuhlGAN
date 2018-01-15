package basicMap;

import java.io.File;

public class Settings {
    public static final String WARN_MSG = "[WARN] ";

    public static final String DEBUG_MSG = "[DEBUG] ";
    public static final String ERROR_MSG = "[ERROR] ";
    public static final String INFO_MSG = "[INFO] ";
    public static final double MAX_VALUE = 1000000.0;

    public static final boolean ACCESSIBLE = true;

    public static final String CMD_SEPARATOR = " ";
    // These lines configure Adam's TensorFlow GAN program, which we are no longer using
    public static final String PY_NAME = "generator.py"; //"/Users/jliu/Documents/GitHub/DagstuhlGAN/marioaiDagstuhl/src/pytorch/Comm.py"; //"game_gan.py";
	public static final String GAN_ARCHITECTURE_FILE = "generator.json";
	public static final String GAN_WEIGHTS_FILE = "generator.h5";
	
	// Use Sebastian's Wasserstein GAN instead of Adam's generic GAN
	public static final boolean WASSERSTEIN = true;
	public static final String WASSERSTEIN_PATH = "pytorch" + File.separator + "generator_ws.py";
	public static final String WASSERSTEIN_GAN = "pytorch" + File.separator + "netG_epoch_24.pth";
	
	// Jacob: IMPORTANT! This is a system-specific path that I had to set.
	public static final String PYTHON_PROGRAM = "/anaconda/bin/python";

    public static void printWarnMsg(String msg) {
        System.out.println(WARN_MSG + msg);
    }

    public static void printDebugMsg(String msg) {
        System.out.println(DEBUG_MSG + msg);
    }

    public static void printInfoMsg(String msg) {
        System.out.println(INFO_MSG + msg);
    }

    public static void printErrorMsg(String msg) {
        System.out.println(ERROR_MSG + msg);
    }
}
