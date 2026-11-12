#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SECURITYCENTER_WINDOWS_WIN32_SYSTEM_SECURITYCENTER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SECURITYCENTER_WINDOWS_WIN32_SYSTEM_SECURITYCENTER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemSecuritycenterWscGetAntiMalwareUri(void* ppszuri);
int32_t windowssysWindowsWin32SystemSecuritycenterWscGetSecurityProviderHealth(uint32_t providers, void* phealth);
int32_t windowssysWindowsWin32SystemSecuritycenterWscQueryAntiMalwareUri(void);
int32_t windowssysWindowsWin32SystemSecuritycenterWscRegisterForChanges(void* reserved, void* phcallbackregistration, void* lpcallbackaddress, void* pcontext);
int32_t windowssysWindowsWin32SystemSecuritycenterWscRegisterForUserNotifications(void);
int32_t windowssysWindowsWin32SystemSecuritycenterWscUnRegisterChanges(void* hregistrationhandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SECURITYCENTER_WINDOWS_WIN32_SYSTEM_SECURITYCENTER_WRAPPER_H */
