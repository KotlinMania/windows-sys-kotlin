#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA(uint32_t credentialflags, void* credentials, void* pcontext);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW(uint32_t credentialflags, void* credentials, void* pcontext);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery(void* pcancelhandle);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw(void* cancelhandle);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(int32_t policyentrytag);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo(void* pwszconnectionname, int32_t type);
void windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList(void* pnamelist);
void windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo(void* pproxyinfo);
void windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx(void* pproxyinfoex);
void windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList(void* pproxylist);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList(void* pnamelist);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pproxyinfoex);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pwszconnectionname, void* pproxyinfoex);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList(void* pwszconnectionname, void* pproxylist);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries(int32_t policyentrytag, void* ppolicyentrylist);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable(void* pconnectionifindexentries);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord);
void windowssysWindowsWin32NetworkmanagementDnsDnsFree(void* pdata, int32_t freetype);
void windowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers(void* pcservers, void* ppservers);
void windowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName(void* proxyname);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings(void* pcservers, void* ppdefaultservers, void* psettings);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation(void* hostname, void* proxyinformation, void* defaultproxyinformation, void* completionroutine, void* completioncontext);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA(void* pname1, void* pname2);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW(void* pname1, void* pname2);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig(int32_t config, uint32_t flag, void* pwsadaptername, void* preserved, void* pbuffer, void* pbuflen);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryEx(void* pqueryrequest, void* pqueryresults, void* pcancelhandle);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw(void* queryrequest, void* cancelhandle);
void windowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree(void* queryresults);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryA(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsQueryW(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare(void* precord1, void* precord2);
void* windowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx(void* precord, int32_t charsetin, int32_t charsetout);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare(void* prr1, void* prr2, void* ppdiff1, void* ppdiff2);
void* windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx(void* precordset, int32_t charsetin, int32_t charsetout);
void* windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach(void* precordlist);
void windowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle(void* hcontext);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse(void* prequest, void* pcancel);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel(void* pcancelhandle);
void* windowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance(void* pservicename, void* phostname, void* pip4, void* pip6, uint16_t wport, uint16_t wpriority, uint16_t wweight, uint32_t dwpropertiescount, void* keys, void* values);
void* windowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance(void* porig);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister(void* prequest, void* pcancel);
void windowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance(void* pinstance);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister(void* prequest, void* pcancel);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel(void* pcancelhandle);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve(void* prequest, void* pcancel);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel(void* pcancelhandle);
uint32_t windowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings(uint32_t cservers, void* pservers, void* psettings);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery(void* pqueryrequest, void* phandle);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery(void* phandle);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA(void* pszname, int32_t format);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8(void* pszname, int32_t format);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW(void* pszname, int32_t format);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired);
int32_t windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WRAPPER_H */
