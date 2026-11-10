#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networkmanagement_webdav_davAddConnection(void* connectionhandle, void* remotename, void* username, void* password, void* clientcert, uint32_t certsize);
uint32_t windowssys_windows_win32_networkmanagement_webdav_davCancelConnectionsToServer(void* lpname, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_webdav_davDeleteConnection(void* connectionhandle);
uint32_t windowssys_windows_win32_networkmanagement_webdav_davFlushFile(void* hfile);
uint32_t windowssys_windows_win32_networkmanagement_webdav_davGetExtendedError(void* hfile, void* exterror, void* exterrorstring, void* cchsize);
uint32_t windowssys_windows_win32_networkmanagement_webdav_davGetHTTPFromUNCPath(void* uncpath, void* url, void* lpsize);
uint32_t windowssys_windows_win32_networkmanagement_webdav_davGetTheLockOwnerOfTheFile(void* filename, void* lockownername, void* lockownernamelengthinbytes);
uint32_t windowssys_windows_win32_networkmanagement_webdav_davGetUNCFromHTTPPath(void* url, void* uncpath, void* lpsize);
uint32_t windowssys_windows_win32_networkmanagement_webdav_davInvalidateCache(void* urlname);
uint32_t windowssys_windows_win32_networkmanagement_webdav_davRegisterAuthCallback(void* callback, uint32_t version);
void windowssys_windows_win32_networkmanagement_webdav_davUnregisterAuthCallback(uint32_t hcallback);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WRAPPER_H */
