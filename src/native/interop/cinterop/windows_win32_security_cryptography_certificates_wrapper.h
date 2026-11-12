#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose(void* hbc);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd(void* hbc);
void windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree(void* pv);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW(void* hbc, void* ppwszzbackuplogfiles, void* pcbsize);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW(void* hbc, void* ppwszzattachmentinformation, void* pcbsize);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW(void* hbc, void* ppwszzfilelist, void* pcbsize);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW(void* hbc, void* pwszattachmentname, uint32_t cbreadhintsize, void* plifilesize);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW(void* pwszservername, uint32_t grbitjet, uint32_t dwbackupflags, void* phbc);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead(void* hbc, void* pvbuffer, uint32_t cbbuffer, void* pcbread);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs(void* hbc);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW(void* pwszservername, void* pfserveronline);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd(void* hbc);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW(void* hbc, void* ppwszzdatabaselocationlist, void* pcbsize);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW(void* pwszservername, uint32_t dwrestoreflags, void* phbc);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete(void* hbc, int32_t hrrestorestate);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile(void* hbc, void* pwszcheckpointfilepath, void* pwszlogpath, void* rgrstmap, int32_t crstmap, void* pwszbackuplogpath, uint32_t genlow, uint32_t genhigh);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW(void* hbc, void* pwszcheckpointfilepath, void* pwszlogpath, void* rgrstmap, int32_t crstmap, void* pwszbackuplogpath, uint32_t genlow, uint32_t genhigh);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW(void* pwszservername, uint32_t dwcontrolflags, void* pcbout, void* ppbout);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey(void* pcert);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain(void* pcert, void* ptrustedissuers, void* ppcertchaincontext);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, int32_t bisclient, void* pdwcertchaincontextcount, void* ppcertchaincontexts);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, void* pptrustedissuers);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, void* pcertcontext, void* pptrustedissuers);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate(void* pcertcontext, void* username);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate(void* pcert, void* ptokeninformationtype, void* pptokeninformation);
int32_t windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate(void* ptargetname, int32_t bisclient, void* prequestedissuancepolicy, void* phadditionalcertstore, void* pcert, void* pprovguid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WINDOWS_WIN32_SECURITY_CRYPTOGRAPHY_CERTIFICATES_WRAPPER_H */
