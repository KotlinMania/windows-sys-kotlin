#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword(void* servername, void* username, bool lmoldpresent, void* lmoldowfpassword, void* lmnewowfpassword, void* ntoldowfpassword, void* ntnewowfpassword);
uint32_t windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword2(void* servername, void* username, void* newpasswordencryptedwitholdnt, void* oldntowfpasswordencryptedwithnewnt, bool lmpresent, void* newpasswordencryptedwitholdlm, void* oldlmowfpasswordencryptedwithnewlmornt);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WRAPPER_H */
