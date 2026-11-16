#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEVELOPERLICENSING_WINDOWS_WIN32_SYSTEM_DEVELOPERLICENSING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEVELOPERLICENSING_WINDOWS_WIN32_SYSTEM_DEVELOPERLICENSING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense(void* hwndparent, void* pexpiration);
int32_t windowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense(void* pexpiration);
int32_t windowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense(void* hwndparent);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DEVELOPERLICENSING_WINDOWS_WIN32_SYSTEM_DEVELOPERLICENSING_WRAPPER_H */
