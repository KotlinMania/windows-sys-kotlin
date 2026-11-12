#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavAddConnection(void* connectionhandle, void* remotename, void* username, void* password, void* clientcert, uint32_t certsize);
uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer(void* lpname, int32_t fforce);
uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection(void* connectionhandle);
uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavFlushFile(void* hfile);
uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError(void* hfile, void* exterror, void* exterrorstring, void* cchsize);
uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath(void* uncpath, void* url, void* lpsize);
uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile(void* filename, void* lockownername, void* lockownernamelengthinbytes);
uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath(void* url, void* uncpath, void* lpsize);
uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache(void* urlname);
uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback(void* callback, uint32_t version);
void windowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(uint32_t hcallback);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WINDOWS_WIN32_NETWORKMANAGEMENT_WEBDAV_WRAPPER_H */
