#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_DIRECTORYSERVICES_WINDOWS_WIN32_SECURITY_DIRECTORYSERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_DIRECTORYSERVICES_WINDOWS_WIN32_SECURITY_DIRECTORYSERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_directoryservices_DSCreateSecurityPage(void* pwszobjectpath, void* pwszobjectclass, uint32_t dwflags, void* phpage, void* pfnreadsd, void* pfnwritesd, int64_t lpcontext);
int32_t windowssys_windows_win32_security_directoryservices_DSEditSecurity(void* hwndowner, void* pwszobjectpath, void* pwszobjectclass, uint32_t dwflags, void* pwszcaption, void* pfnreadsd, void* pfnwritesd, int64_t lpcontext);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_DIRECTORYSERVICES_WINDOWS_WIN32_SECURITY_DIRECTORYSERVICES_WRAPPER_H */
