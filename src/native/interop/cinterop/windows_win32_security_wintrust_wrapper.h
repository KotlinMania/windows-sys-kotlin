#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINTRUST_WINDOWS_WIN32_SECURITY_WINTRUST_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINTRUST_WINDOWS_WIN32_SECURITY_WINTRUST_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog(void* hwndparent);
int32_t windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx(void* hwndparent, uint32_t dwflags, void* pvreserved);
int32_t windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature(void* pprovdata);
int32_t windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned(uint32_t dwencoding, void* pcert);
void* windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain(void* psgnr, uint32_t idxcert);
void* windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain(void* pprovdata, void* pgproviderid);
void* windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain(void* pprovdata, uint32_t idxsigner, int32_t fcountersigner, uint32_t idxcountersigner);
void* windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData(void* hstatedata);
int32_t windowssysWindowsWin32SecurityWintrustWinVerifyTrust(void* hwnd, void* pgactionid, void* pwvtdata);
int32_t windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx(void* hwnd, void* pgactionid, void* pwintrustdata);
int32_t windowssysWindowsWin32SecurityWintrustWintrustAddActionID(void* pgactionid, uint32_t fdwflags, void* psprovinfo);
int32_t windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage(void* pszusageoid, void* psdefusage);
int32_t windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage(uint32_t dwaction, void* pszusageoid, void* psusage);
void windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags(void* pdwpolicyflags);
int32_t windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers(void* pgactionid, void* ppfns);
int32_t windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID(void* pgactionid);
void windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(int32_t fincludepepagehashes);
int32_t windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(uint32_t dwpolicyflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINTRUST_WINDOWS_WIN32_SECURITY_WINTRUST_WRAPPER_H */
