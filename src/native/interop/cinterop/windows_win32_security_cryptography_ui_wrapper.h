#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SecurityCryptographyUiCertSelectionGetSerializedBlob(void* pcsi, void* ppoutbuffer, void* puloutbuffersize);
int32_t windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgCertMgr(void* pcryptuicertmgr);
void* windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgSelectCertificateFromStore(void* hcertstore, void* hwnd, void* pwsztitle, void* pwszdisplaystring, uint32_t dwdontusecolumn, uint32_t dwflags, void* pvreserved);
int32_t windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateA(void* pcertviewinfo, void* pfpropertieschanged);
int32_t windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewCertificateW(void* pcertviewinfo, void* pfpropertieschanged);
int32_t windowssysWindowsWin32SecurityCryptographyUiCryptUIDlgViewContext(uint32_t dwcontexttype, void* pvcontext, void* hwnd, void* pwsztitle, uint32_t dwflags, void* pvreserved);
int32_t windowssysWindowsWin32SecurityCryptographyUiCryptUIWizDigitalSign(uint32_t dwflags, void* hwndparent, void* pwszwizardtitle, void* pdigitalsigninfo, void* ppsigncontext);
int32_t windowssysWindowsWin32SecurityCryptographyUiCryptUIWizExport(uint32_t dwflags, void* hwndparent, void* pwszwizardtitle, void* pexportinfo, void* pvoid);
int32_t windowssysWindowsWin32SecurityCryptographyUiCryptUIWizFreeDigitalSignContext(void* psigncontext);
int32_t windowssysWindowsWin32SecurityCryptographyUiCryptUIWizImport(uint32_t dwflags, void* hwndparent, void* pwszwizardtitle, void* pimportsrc, void* hdestcertstore);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WRAPPER_H */
