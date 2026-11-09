#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword(void* servername, void* username, bool lmoldpresent, void* lmoldowfpassword, void* lmnewowfpassword, void* ntoldowfpassword, void* ntnewowfpassword);
uint32_t windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword2(void* servername, void* username, void* newpasswordencryptedwitholdnt, void* oldntowfpasswordencryptedwithnewnt, bool lmpresent, void* newpasswordencryptedwitholdlm, void* oldlmowfpasswordencryptedwithnewlmornt);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WINDOWS_WIN32_SYSTEM_PASSWORDMANAGEMENT_WRAPPER_H */
