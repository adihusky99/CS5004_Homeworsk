package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {

    /** The locality ID number. */
    private int localityID;

    /** The locality name. */
    private String localityName;

    /** The greeting using ascii characters only. */
    private String asciiGreeting;

    /** The greeting using unicode characters. */
    private String unicodeGreeting;

    /**
     * The format string for the greeting. Contains a %s placeholder for the name
     * and uses the greeting as part of the format (e.g. "%s, %%s!" or "%%s, %s!").
     */
    private String formatStr;

    /**
     * Default greeting constructor. Creates a "Hello, {name}!" greeting.
     *
     * @param localityID   id of the locality
     * @param localityName name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Creates a greeting with a single greeting string (ascii and unicode are the same).
     * Uses the default format "{greeting}, {name}!".
     *
     * @param localityID   id of the locality
     * @param localityName name of the locality
     * @param greeting     greeting using ascii characters
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Full constructor. Creates a greeting with separate ascii and unicode strings
     * and a custom format string.
     *
     * @param localityID      id of the locality
     * @param localityName    name of the locality
     * @param asciiGreeting   greeting using ascii characters
     * @param unicodeGreeting greeting using unicode characters
     * @param formatStr       format string for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
            String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Returns the locality id number.
     *
     * @return the locality id number
     */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Returns the locality name.
     *
     * @return the locality name
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * Returns the ascii greeting (just the greeting word, no formatting).
     *
     * @return the ascii greeting
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * Returns the unicode greeting (just the greeting word, no formatting).
     *
     * @return the unicode greeting
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Gets the unicode format string with the greeting inserted.
     * The result will contain a %s where the person's name should go.
     *
     * @return the format string with the greeting inserted
     */
    public String getFormatStr() {
        return getFormatStr(false);
    }

    /**
     * Returns the format string with the greeting inserted.
     * The result will contain a %s where the person's name should go.
     *
     * @param asciiOnly if true, uses ascii greeting; otherwise uses unicode greeting
     * @return the format string with the greeting inserted
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(this.formatStr, this.asciiGreeting);
        }
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    /**
     * Returns the full greeting details as a string. Primarily for debugging.
     * Example: {localityID:1, localityName:"Hawaii", asciiGreeting:"Aloha", unicodeGreeting:"Aloha"}
     *
     * @return the full greeting details as a string
     */
    @Override
    public String toString() {
        return "{localityID:" + this.localityID
                + ", localityName:\"" + this.localityName + "\""
                + ", asciiGreeting:\"" + this.asciiGreeting + "\""
                + ", unicodeGreeting:\"" + this.unicodeGreeting + "\"}";
    }

}
