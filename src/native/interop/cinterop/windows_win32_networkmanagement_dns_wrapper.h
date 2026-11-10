#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleA(uint32_t credentialflags, void* credentials, void* pcontext);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleW(uint32_t credentialflags, void* credentials, void* pcontext);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsCancelQuery(void* pcancelhandle);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsCancelQueryRaw(void* cancelhandle);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeletePolicyEntries(int32_t policyentrytag);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeleteProxyInfo(void* pwszconnectionname, int32_t type);
void windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeNameList(void* pnamelist);
void windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfo(void* pproxyinfo);
void windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfoEx(void* pproxyinfoex);
void windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyList(void* pproxylist);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetNameList(void* pnamelist);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrl(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pproxyinfoex);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrlEx(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pwszconnectionname, void* pproxyinfoex);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyList(void* pwszconnectionname, void* pproxylist);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetPolicyEntries(int32_t policyentrytag, void* ppolicyentrylist);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsConnectionUpdateIfIndexTable(void* pconnectionifindexentries);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageUtf8(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageW(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord);
void windowssys_windows_win32_networkmanagement_dns_dnsFree(void* pdata, int32_t freetype);
void windowssys_windows_win32_networkmanagement_dns_dnsFreeCustomServers(void* pcservers, void* ppservers);
void windowssys_windows_win32_networkmanagement_dns_dnsFreeProxyName(void* proxyname);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsGetApplicationSettings(void* pcservers, void* ppdefaultservers, void* psettings);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsGetProxyInformation(void* hostname, void* proxyinformation, void* defaultproxyinformation, void* completionroutine, void* completioncontext);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetA(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetUtf8(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetW(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsNameCompareA(void* pname1, void* pname2);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsNameCompareW(void* pname1, void* pname2);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsQueryConfig(int32_t config, uint32_t flag, void* pwsadaptername, void* preserved, void* pbuffer, void* pbuflen);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsQueryEx(void* pqueryrequest, void* pqueryresults, void* pcancelhandle);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsQueryRaw(void* queryrequest, void* cancelhandle);
void windowssys_windows_win32_networkmanagement_dns_dnsQueryRawResultFree(void* queryresults);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsQueryA(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsQueryUtf8(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsQueryW(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsRecordCompare(void* precord1, void* precord2);
void* windowssys_windows_win32_networkmanagement_dns_dnsRecordCopyEx(void* precord, int32_t charsetin, int32_t charsetout);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCompare(void* prr1, void* prr2, void* ppdiff1, void* ppdiff2);
void* windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCopyEx(void* precordset, int32_t charsetin, int32_t charsetout);
void* windowssys_windows_win32_networkmanagement_dns_dnsRecordSetDetach(void* precordlist);
void windowssys_windows_win32_networkmanagement_dns_dnsReleaseContextHandle(void* hcontext);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetA(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetUTF8(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetW(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowse(void* prequest, void* pcancel);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowseCancel(void* pcancelhandle);
void* windowssys_windows_win32_networkmanagement_dns_dnsServiceConstructInstance(void* pservicename, void* phostname, void* pip4, void* pip6, uint16_t wport, uint16_t wpriority, uint16_t wweight, uint32_t dwpropertiescount, void* keys, void* values);
void* windowssys_windows_win32_networkmanagement_dns_dnsServiceCopyInstance(void* porig);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsServiceDeRegister(void* prequest, void* pcancel);
void windowssys_windows_win32_networkmanagement_dns_dnsServiceFreeInstance(void* pinstance);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsServiceRegister(void* prequest, void* pcancel);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsServiceRegisterCancel(void* pcancelhandle);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsServiceResolve(void* prequest, void* pcancel);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsServiceResolveCancel(void* pcancelhandle);
uint32_t windowssys_windows_win32_networkmanagement_dns_dnsSetApplicationSettings(uint32_t cservers, void* pservers, void* psettings);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsStartMulticastQuery(void* pqueryrequest, void* phandle);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsStopMulticastQuery(void* phandle);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsValidateNameA(void* pszname, int32_t format);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsValidateNameUtf8(void* pszname, int32_t format);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsValidateNameW(void* pszname, int32_t format);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferUtf8(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired);
int32_t windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferW(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WRAPPER_H */
