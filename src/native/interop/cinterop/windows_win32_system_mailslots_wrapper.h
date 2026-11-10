#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_system_mailslots_createMailslotA(void* lpname, uint32_t nmaxmessagesize, uint32_t lreadtimeout, void* lpsecurityattributes);
void* windowssys_windows_win32_system_mailslots_createMailslotW(void* lpname, uint32_t nmaxmessagesize, uint32_t lreadtimeout, void* lpsecurityattributes);
int32_t windowssys_windows_win32_system_mailslots_getMailslotInfo(void* hmailslot, void* lpmaxmessagesize, void* lpnextsize, void* lpmessagecount, void* lpreadtimeout);
int32_t windowssys_windows_win32_system_mailslots_setMailslotInfo(void* hmailslot, uint32_t lreadtimeout);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WRAPPER_H */
