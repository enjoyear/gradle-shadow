1.  ./gradlew clean build
2. go to build/libs to unzip the jar test-1.0-SNAPSHOT.jar to build/libs/
3. javap -verbose -c -l build/libs/chen/guo/GoogleAdWordsExtractor.class
- Look for LocalVariableTable, rootSession's signature is shaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession
- Under the Code section, 9: invokevirtual #31                 // Method chen/guo/GoogleAdWordsCredential.buildRootSession:()Lshaded/com/google/api/ads/adwords/lib/client/AdWordsSession$ImmutableAdWordsSession;
