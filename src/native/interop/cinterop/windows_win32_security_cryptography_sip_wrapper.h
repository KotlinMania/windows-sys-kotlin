#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPAddProvider(void* psnewprov);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPCreateIndirectData(void* psubjectinfo, void* pcbindirectdata, void* pindirectdata);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPGetCaps(void* psubjinfo, void* pcaps);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSealedDigest(void* psubjectinfo, void* psig, uint32_t dwsig, void* pbdigest, void* pcbdigest);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPGetSignedDataMsg(void* psubjectinfo, void* pdwencodingtype, uint32_t dwindex, void* pcbsigneddatamsg, void* pbsigneddatamsg);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPLoad(void* pgsubject, uint32_t dwflags, void* psipdispatch);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPPutSignedDataMsg(void* psubjectinfo, uint32_t dwencodingtype, void* pdwindex, uint32_t cbsigneddatamsg, void* pbsigneddatamsg);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveProvider(void* pgprov);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPRemoveSignedDataMsg(void* psubjectinfo, uint32_t dwindex);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuid(void* filename, void* hfilein, void* pgsubject);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPRetrieveSubjectGuidForCatalogFile(void* filename, void* hfilein, void* pgsubject);
int32_t windowssys_windows_win32_security_cryptography_sip_CryptSIPVerifyIndirectData(void* psubjectinfo, void* pindirectdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WRAPPER_H */
