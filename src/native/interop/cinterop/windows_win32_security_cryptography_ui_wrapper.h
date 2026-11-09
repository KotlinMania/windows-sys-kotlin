#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_cryptography_ui_CertSelectionGetSerializedBlob(void* pcsi, void* ppoutbuffer, void* puloutbuffersize);
int32_t windowssys_windows_win32_security_cryptography_ui_CryptUIDlgCertMgr(void* pcryptuicertmgr);
void* windowssys_windows_win32_security_cryptography_ui_CryptUIDlgSelectCertificateFromStore(void* hcertstore, void* hwnd, void* pwsztitle, void* pwszdisplaystring, uint32_t dwdontusecolumn, uint32_t dwflags, void* pvreserved);
int32_t windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateA(void* pcertviewinfo, void* pfpropertieschanged);
int32_t windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewCertificateW(void* pcertviewinfo, void* pfpropertieschanged);
int32_t windowssys_windows_win32_security_cryptography_ui_CryptUIDlgViewContext(uint32_t dwcontexttype, void* pvcontext, void* hwnd, void* pwsztitle, uint32_t dwflags, void* pvreserved);
int32_t windowssys_windows_win32_security_cryptography_ui_CryptUIWizDigitalSign(uint32_t dwflags, void* hwndparent, void* pwszwizardtitle, void* pdigitalsigninfo, void* ppsigncontext);
int32_t windowssys_windows_win32_security_cryptography_ui_CryptUIWizExport(uint32_t dwflags, void* hwndparent, void* pwszwizardtitle, void* pexportinfo, void* pvoid);
int32_t windowssys_windows_win32_security_cryptography_ui_CryptUIWizFreeDigitalSignContext(void* psigncontext);
int32_t windowssys_windows_win32_security_cryptography_ui_CryptUIWizImport(uint32_t dwflags, void* hwndparent, void* pwszwizardtitle, void* pimportsrc, void* hdestcertstore);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_UI_WRAPPER_H */
