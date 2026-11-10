#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPAddProvider(void* psnewprov);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPCreateIndirectData(void* psubjectinfo, void* pcbindirectdata, void* pindirectdata);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPGetCaps(void* psubjinfo, void* pcaps);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSealedDigest(void* psubjectinfo, void* psig, uint32_t dwsig, void* pbdigest, void* pcbdigest);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPGetSignedDataMsg(void* psubjectinfo, void* pdwencodingtype, uint32_t dwindex, void* pcbsigneddatamsg, void* pbsigneddatamsg);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPLoad(void* pgsubject, uint32_t dwflags, void* psipdispatch);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPPutSignedDataMsg(void* psubjectinfo, uint32_t dwencodingtype, void* pdwindex, uint32_t cbsigneddatamsg, void* pbsigneddatamsg);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveProvider(void* pgprov);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPRemoveSignedDataMsg(void* psubjectinfo, uint32_t dwindex);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuid(void* filename, void* hfilein, void* pgsubject);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPRetrieveSubjectGuidForCatalogFile(void* filename, void* hfilein, void* pgsubject);
int32_t windowssys_windows_win32_security_cryptography_sip_cryptSIPVerifyIndirectData(void* psubjectinfo, void* pindirectdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WRAPPER_H */
