package scal.io.liger;


public class Constants {

    /** RequestCodes used for external Media Capture via
     *  {@link android.app.Activity#startActivityForResult(android.content.Intent, int)} */
    public static final int REQUEST_VIDEO_CAPTURE = 100;
    public static final int REQUEST_IMAGE_CAPTURE = 101;
    public static final int REQUEST_AUDIO_CAPTURE = 102;
    public static final int REQUEST_FILE_IMPORT   = 103;

    /** Intent extras used for external Media Capture via
     *  {@link android.app.Activity#startActivityForResult(android.content.Intent, int)} */
    public static final String EXTRA_PATH_ID         = "EXTRA_PATH_ID";
    public static final String EXTRA_FILE_LOCATION   = "FILE_LOCATION";
    public static final String PREFS_CALLING_CARD_ID = "PREFS_CALLING_CARD_ID";

    /** Intent extras used when launching MainActivity */
    public static final String EXTRA_LANG                 = "lang";
    public static final String EXTRA_PHOTO_SLIDE_DURATION = "photo_essay_slide_duration";

    /** Values for {@link scal.io.liger.model.ExampleCard#medium} and
     * {@link scal.io.liger.model.MediaFile#medium} */
    public static final String AUDIO = "audio";
    public static final String PHOTO = "photo";
    public static final String VIDEO = "video";

    /** Valuesfor {@link scal.io.liger.model.ClipMetadata#type */
    public static final String CHARACTER = "character";
    public static final String ACTION    = "action";
    public static final String RESULT    = "result";
    public static final String PLACE     = "place";
    public static final String SIGNATURE = "signature";
    public static final String NARRATION = "narration";

    /** Value returned by {@link scal.io.liger.model.StoryPath#getReferencedValue(String)}
     * when the requested reference value is external to the StoryPath */
    public static final String EXTERNAL = "value_from_external_story_path";

    /** StoryMaker Intent Actions */
    public static final String ACTION_PUBLISH = "io.scal.liger.PUBLISH";

    /** expansion file management */
    // TODO switch to .org & https
    public static final String LIGER_URL = "http://storymaker.cc/appdata/";
    public static final String MAIN = "main";
    public static final String PATCH = "patch";
    public static final int MAIN_VERSION = 1006;
    public static final int PATCH_VERSION = 0;

    public static final String EXTRA_STORY_TITLE = "story_title";
    public static final String EXTRA_EXPORT_CLIPS = "export_clips";
}
