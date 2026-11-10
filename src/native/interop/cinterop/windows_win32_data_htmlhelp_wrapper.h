#ifndef WINDOWSSYS_WINDOWS_WIN32_DATA_HTMLHELP_WINDOWS_WIN32_DATA_HTMLHELP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DATA_HTMLHELP_WINDOWS_WIN32_DATA_HTMLHELP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_data_htmlhelp_htmlHelpA(void* hwndcaller, void* pszfile, uint32_t ucommand, uint64_t dwdata);
void* windowssys_windows_win32_data_htmlhelp_htmlHelpW(void* hwndcaller, void* pszfile, uint32_t ucommand, uint64_t dwdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DATA_HTMLHELP_WINDOWS_WIN32_DATA_HTMLHELP_WRAPPER_H */
