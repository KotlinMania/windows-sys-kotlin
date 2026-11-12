#ifndef WINDOWSSYS_WINDOWS_WIN32_DATA_HTMLHELP_WINDOWS_WIN32_DATA_HTMLHELP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DATA_HTMLHELP_WINDOWS_WIN32_DATA_HTMLHELP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssysWindowsWin32DataHtmlhelpHtmlHelpA(void* hwndcaller, void* pszfile, uint32_t ucommand, uint64_t dwdata);
void* windowssysWindowsWin32DataHtmlhelpHtmlHelpW(void* hwndcaller, void* pszfile, uint32_t ucommand, uint64_t dwdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DATA_HTMLHELP_WINDOWS_WIN32_DATA_HTMLHELP_WRAPPER_H */
