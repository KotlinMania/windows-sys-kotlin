#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssysWindowsWin32SystemMailslotsCreateMailslotA(void* lpname, uint32_t nmaxmessagesize, uint32_t lreadtimeout, void* lpsecurityattributes);
void* windowssysWindowsWin32SystemMailslotsCreateMailslotW(void* lpname, uint32_t nmaxmessagesize, uint32_t lreadtimeout, void* lpsecurityattributes);
int32_t windowssysWindowsWin32SystemMailslotsGetMailslotInfo(void* hmailslot, void* lpmaxmessagesize, void* lpnextsize, void* lpmessagecount, void* lpreadtimeout);
int32_t windowssysWindowsWin32SystemMailslotsSetMailslotInfo(void* hmailslot, uint32_t lreadtimeout);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WINDOWS_WIN32_SYSTEM_MAILSLOTS_WRAPPER_H */
