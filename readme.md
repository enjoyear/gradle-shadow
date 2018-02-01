## Example
This contains an example to depend on a shaded module and wrap everything into a tar ball


## Issue
1.  ./gradlew clean build
2. go to build/libs to unzip the jar test-1.0-SNAPSHOT.jar to build/libs/
3. javap -verbose -c -l build/libs/chen/guo/GoogleAdWordsExtractor.class
- Look for LocalVariableTable, rootSession's signature is shaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession
- Under the Code section, 9: invokevirtual #31                 // Method chen/guo/GoogleAdWordsCredential.buildRootSession:()Lshaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession;


### Java bytecode for GoogleAdWordsExtractor.class
```
Classfile /Users/chguo/Downloads/test/build/libs/chen/guo/GoogleAdWordsExtractor.class
  Last modified Apr 10, 2017; size 1161 bytes
  MD5 checksum a13613b4bde057b8b6c904d931195212
  Compiled from "GoogleAdWordsExtractor.java"
public class chen.guo.GoogleAdWordsExtractor
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Utf8               chen/guo/GoogleAdWordsExtractor
   #2 = Class              #1             // chen/guo/GoogleAdWordsExtractor
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               GoogleAdWordsExtractor.java
   #6 = Utf8               shaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession
   #7 = Class              #6             // shaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession
   #8 = Utf8               shaded/com/google/api/ads/adwords/lib/client/AdWordsSession
   #9 = Class              #8             // shaded/com/google/api/ads/adwords/lib/client/AdWordsSession
  #10 = Utf8               ImmutableAdWordsSession
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = NameAndType        #11:#12        // "<init>":()V
  #14 = Methodref          #4.#13         // java/lang/Object."<init>":()V
  #15 = Utf8               this
  #16 = Utf8               Lchen/guo/GoogleAdWordsExtractor;
  #17 = Utf8               main
  #18 = Utf8               ([Ljava/lang/String;)V
  #19 = Utf8               java/security/GeneralSecurityException
  #20 = Class              #19            // java/security/GeneralSecurityException
  #21 = Utf8               java/io/IOException
  #22 = Class              #21            // java/io/IOException
  #23 = Utf8               shaded/com/google/api/ads/common/lib/exception/ValidationException
  #24 = Class              #23            // shaded/com/google/api/ads/common/lib/exception/ValidationException
  #25 = Utf8               chen/guo/GoogleAdWordsCredential
  #26 = Class              #25            // chen/guo/GoogleAdWordsCredential
  #27 = Methodref          #26.#13        // chen/guo/GoogleAdWordsCredential."<init>":()V
  #28 = Utf8               buildRootSession
  #29 = Utf8               ()Lshaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession;
  #30 = NameAndType        #28:#29        // buildRootSession:()Lshaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession;
  #31 = Methodref          #26.#30        // chen/guo/GoogleAdWordsCredential.buildRootSession:()Lshaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession;
  #32 = Utf8               args
  #33 = Utf8               [Ljava/lang/String;
  #34 = Utf8               credential
  #35 = Utf8               Lchen/guo/GoogleAdWordsCredential;
  #36 = Utf8               rootSession
  #37 = Utf8               Lshaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession;
  #38 = Utf8               Code
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               LineNumberTable
  #41 = Utf8               Exceptions
  #42 = Utf8               SourceFile
  #43 = Utf8               InnerClasses
{
  public chen.guo.GoogleAdWordsExtractor();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #14                 // Method java/lang/Object."<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lchen/guo/GoogleAdWordsExtractor;
      LineNumberTable:
        line 10: 0

  public static void main(java.lang.String[]) throws java.security.GeneralSecurityException, java.io.IOException, shaded.com.google.api.ads.common.lib.exception.ValidationException;
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: new           #26                 // class chen/guo/GoogleAdWordsCredential
         3: dup
         4: invokespecial #27                 // Method chen/guo/GoogleAdWordsCredential."<init>":()V
         7: astore_1
         8: aload_1
         9: invokevirtual #31                 // Method chen/guo/GoogleAdWordsCredential.buildRootSession:()Lshaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession;
        12: astore_2
        13: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  args   [Ljava/lang/String;
            8       6     1 credential   Lchen/guo/GoogleAdWordsCredential;
           13       1     2 rootSession   Lshaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession;
      LineNumberTable:
        line 13: 0
        line 15: 8
        line 16: 13
    Exceptions:
      throws java.security.GeneralSecurityException, java.io.IOException, shaded.com.google.api.ads.common.lib.exception.ValidationException
}
SourceFile: "GoogleAdWordsExtractor.java"
InnerClasses:
     public static final #10= #7 of #9; //ImmutableAdWordsSession=class shaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession of class shaded/com/google/api/ads/adwords/lib/client/AdWordsSession
```