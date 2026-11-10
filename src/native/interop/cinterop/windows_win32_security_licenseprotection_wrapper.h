#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_LICENSEPROTECTION_WINDOWS_WIN32_SECURITY_LICENSEPROTECTION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_LICENSEPROTECTION_WINDOWS_WIN32_SECURITY_LICENSEPROTECTION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_licenseprotection_registerLicenseKeyWithExpiration(void* licensekey, uint32_t validityindays, void* status);
int32_t windowssys_windows_win32_security_licenseprotection_validateLicenseKeyProtection(void* licensekey, void* notvalidbefore, void* notvalidafter, void* status);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_LICENSEPROTECTION_WINDOWS_WIN32_SECURITY_LICENSEPROTECTION_WRAPPER_H */
