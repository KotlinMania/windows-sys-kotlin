#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networkmanagement_webdav_DavAddConnection(void* connectionhandle, void* remotename, void* username, void* password, void* clientcert, uint32_t certsize);
uint32_t windowssys_windows_win32_networkmanagement_webdav_DavCancelConnectionsToServer(void* lpname, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_webdav_DavDeleteConnection(void* connectionhandle);
uint32_t windowssys_windows_win32_networkmanagement_webdav_DavFlushFile(void* hfile);
uint32_t windowssys_windows_win32_networkmanagement_webdav_DavGetExtendedError(void* hfile, void* exterror, void* exterrorstring, void* cchsize);
uint32_t windowssys_windows_win32_networkmanagement_webdav_DavGetHTTPFromUNCPath(void* uncpath, void* url, void* lpsize);
uint32_t windowssys_windows_win32_networkmanagement_webdav_DavGetTheLockOwnerOfTheFile(void* filename, void* lockownername, void* lockownernamelengthinbytes);
uint32_t windowssys_windows_win32_networkmanagement_webdav_DavGetUNCFromHTTPPath(void* url, void* uncpath, void* lpsize);
uint32_t windowssys_windows_win32_networkmanagement_webdav_DavInvalidateCache(void* urlname);
uint32_t windowssys_windows_win32_networkmanagement_webdav_DavRegisterAuthCallback(void* callback, uint32_t version);
void windowssys_windows_win32_networkmanagement_webdav_DavUnregisterAuthCallback(uint32_t hcallback);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WRAPPER_H */
