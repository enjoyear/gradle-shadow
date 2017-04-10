package chen.guo;

import java.io.IOException;
import java.security.GeneralSecurityException;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.exception.ValidationException;


public class GoogleAdWordsExtractor {
  public static void main(String[] args)
      throws GeneralSecurityException, IOException, ValidationException {
    GoogleAdWordsCredential credential = new GoogleAdWordsCredential();

    AdWordsSession.ImmutableAdWordsSession rootSession = credential.buildRootSession();
  }
}
