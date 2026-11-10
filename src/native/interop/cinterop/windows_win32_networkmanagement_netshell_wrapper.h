#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networkmanagement_netshell_matchEnumTag(void* hmodule, void* pwcarg, uint32_t dwnumarg, void* penumtable, void* pdwvalue);
int32_t windowssys_windows_win32_networkmanagement_netshell_matchToken(void* pwszusertoken, void* pwszcmdtoken);
uint32_t windowssys_windows_win32_networkmanagement_netshell_preprocessCommand(void* hmodule, void* ppwcarguments, uint32_t dwcurrentindex, uint32_t dwargcount, void* ptttags, uint32_t dwtagcount, uint32_t dwminargs, uint32_t dwmaxargs, void* pdwtagtype);
uint32_t windowssys_windows_win32_networkmanagement_netshell_printError(void* hmodule, uint32_t dwerrid, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssys_windows_win32_networkmanagement_netshell_printMessage(void* pwszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssys_windows_win32_networkmanagement_netshell_printMessageFromModule(void* hmodule, uint32_t dwmsgid, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssys_windows_win32_networkmanagement_netshell_registerContext(void* pchildcontext);
uint32_t windowssys_windows_win32_networkmanagement_netshell_registerHelper(void* pguidparentcontext, void* pfnregistersubcontext);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WRAPPER_H */
