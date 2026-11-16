#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider(void* psnewprov);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData(void* psubjectinfo, void* pcbindirectdata, void* pindirectdata);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps(void* psubjinfo, void* pcaps);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest(void* psubjectinfo, void* psig, uint32_t dwsig, void* pbdigest, void* pcbdigest);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg(void* psubjectinfo, void* pdwencodingtype, uint32_t dwindex, void* pcbsigneddatamsg, void* pbsigneddatamsg);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad(void* pgsubject, uint32_t dwflags, void* psipdispatch);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg(void* psubjectinfo, uint32_t dwencodingtype, void* pdwindex, uint32_t cbsigneddatamsg, void* pbsigneddatamsg);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider(void* pgprov);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg(void* psubjectinfo, uint32_t dwindex);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid(void* filename, void* hfilein, void* pgsubject);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile(void* filename, void* hfilein, void* pgsubject);
int32_t windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData(void* psubjectinfo, void* pindirectdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_SIP_WRAPPER_H */
