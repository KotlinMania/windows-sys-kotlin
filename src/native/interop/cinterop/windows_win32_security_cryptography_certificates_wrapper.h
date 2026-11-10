#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvBackupClose(void* hbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvBackupEnd(void* hbc);
void windowssys_windows_win32_security_cryptography_certificates_certSrvBackupFree(void* pv);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetBackupLogsW(void* hbc, void* ppwszzbackuplogfiles, void* pcbsize);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDatabaseNamesW(void* hbc, void* ppwszzattachmentinformation, void* pcbsize);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDynamicFileListW(void* hbc, void* ppwszzfilelist, void* pcbsize);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvBackupOpenFileW(void* hbc, void* pwszattachmentname, uint32_t cbreadhintsize, void* plifilesize);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvBackupPrepareW(void* pwszservername, uint32_t grbitjet, uint32_t dwbackupflags, void* phbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvBackupRead(void* hbc, void* pvbuffer, uint32_t cbbuffer, void* pcbread);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvBackupTruncateLogs(void* hbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvIsServerOnlineW(void* pwszservername, void* pfserveronline);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreEnd(void* hbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreGetDatabaseLocationsW(void* hbc, void* ppwszzdatabaselocationlist, void* pcbsize);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvRestorePrepareW(void* pwszservername, uint32_t dwrestoreflags, void* phbc);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterComplete(void* hbc, int32_t hrrestorestate);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterThroughFile(void* hbc, void* pwszcheckpointfilepath, void* pwszlogpath, void* rgrstmap, int32_t crstmap, void* pwszbackuplogpath, uint32_t genlow, uint32_t genhigh);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterW(void* hbc, void* pwszcheckpointfilepath, void* pwszlogpath, void* rgrstmap, int32_t crstmap, void* pwszbackuplogpath, uint32_t genlow, uint32_t genhigh);
int32_t windowssys_windows_win32_security_cryptography_certificates_certSrvServerControlW(void* pwszservername, uint32_t dwcontrolflags, void* pcbout, void* ppbout);
int32_t windowssys_windows_win32_security_cryptography_certificates_pstAcquirePrivateKey(void* pcert);
int32_t windowssys_windows_win32_security_cryptography_certificates_pstGetCertificateChain(void* pcert, void* ptrustedissuers, void* ppcertchaincontext);
int32_t windowssys_windows_win32_security_cryptography_certificates_pstGetCertificates(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, int32_t bisclient, void* pdwcertchaincontextcount, void* ppcertchaincontexts);
int32_t windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchors(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, void* pptrustedissuers);
int32_t windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchorsEx(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, void* pcertcontext, void* pptrustedissuers);
int32_t windowssys_windows_win32_security_cryptography_certificates_pstGetUserNameForCertificate(void* pcertcontext, void* username);
int32_t windowssys_windows_win32_security_cryptography_certificates_pstMapCertificate(void* pcert, void* ptokeninformationtype, void* pptokeninformation);
int32_t windowssys_windows_win32_security_cryptography_certificates_pstValidate(void* ptargetname, int32_t bisclient, void* prequestedissuancepolicy, void* phadditionalcertstore, void* pcert, void* pprovguid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WRAPPER_H */
