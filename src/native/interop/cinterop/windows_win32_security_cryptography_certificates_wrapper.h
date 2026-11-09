#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupClose(void* hbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupEnd(void* hbc);
void windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupFree(void* pv);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetBackupLogsW(void* hbc, void* ppwszzbackuplogfiles, void* pcbsize);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDatabaseNamesW(void* hbc, void* ppwszzattachmentinformation, void* pcbsize);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDynamicFileListW(void* hbc, void* ppwszzfilelist, void* pcbsize);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupOpenFileW(void* hbc, void* pwszattachmentname, uint32_t cbreadhintsize, void* plifilesize);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupPrepareW(void* pwszservername, uint32_t grbitjet, uint32_t dwbackupflags, void* phbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupRead(void* hbc, void* pvbuffer, uint32_t cbbuffer, void* pcbread);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupTruncateLogs(void* hbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvIsServerOnlineW(void* pwszservername, void* pfserveronline);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreEnd(void* hbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreGetDatabaseLocationsW(void* hbc, void* ppwszzdatabaselocationlist, void* pcbsize);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestorePrepareW(void* pwszservername, uint32_t dwrestoreflags, void* phbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterComplete(void* hbc, int32_t hrrestorestate);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterThroughFile(void* hbc, void* pwszcheckpointfilepath, void* pwszlogpath, void* rgrstmap, int32_t crstmap, void* pwszbackuplogpath, uint32_t genlow, uint32_t genhigh);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterW(void* hbc, void* pwszcheckpointfilepath, void* pwszlogpath, void* rgrstmap, int32_t crstmap, void* pwszbackuplogpath, uint32_t genlow, uint32_t genhigh);
int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvServerControlW(void* pwszservername, uint32_t dwcontrolflags, void* pcbout, void* ppbout);
int32_t windowssys_windows_win32_security_cryptography_certificates_PstAcquirePrivateKey(void* pcert);
int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetCertificateChain(void* pcert, void* ptrustedissuers, void* ppcertchaincontext);
int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetCertificates(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, int32_t bisclient, void* pdwcertchaincontextcount, void* ppcertchaincontexts);
int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchors(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, void* pptrustedissuers);
int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchorsEx(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, void* pcertcontext, void* pptrustedissuers);
int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetUserNameForCertificate(void* pcertcontext, void* username);
int32_t windowssys_windows_win32_security_cryptography_certificates_PstMapCertificate(void* pcert, void* ptokeninformationtype, void* pptokeninformation);
int32_t windowssys_windows_win32_security_cryptography_certificates_PstValidate(void* ptargetname, int32_t bisclient, void* prequestedissuancepolicy, void* phadditionalcertstore, void* pcert, void* pprovguid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WRAPPER_H */
