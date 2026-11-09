#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_A(uint32_t credentialflags, void* credentials, void* pcontext);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_W(uint32_t credentialflags, void* credentials, void* pcontext);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsCancelQuery(void* pcancelhandle);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsCancelQueryRaw(void* cancelhandle);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeletePolicyEntries(int32_t policyentrytag);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeleteProxyInfo(void* pwszconnectionname, int32_t type);
void windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeNameList(void* pnamelist);
void windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfo(void* pproxyinfo);
void windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfoEx(void* pproxyinfoex);
void windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyList(void* pproxylist);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetNameList(void* pnamelist);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrl(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pproxyinfoex);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrlEx(void* pwszhosturl, void* pselectioncontext, uint32_t dwselectioncontextlength, uint32_t dwexplicitinterfaceindex, void* pwszconnectionname, void* pproxyinfoex);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyList(void* pwszconnectionname, void* pproxylist);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetPolicyEntries(int32_t policyentrytag, void* ppolicyentrylist);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetProxyInfo(void* pwszconnectionname, int32_t type, void* pproxyinfo);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsConnectionUpdateIfIndexTable(void* pconnectionifindexentries);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_UTF8(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_W(void* pdnsbuffer, uint16_t wmessagelength, void* pprecord);
void windowssys_windows_win32_networkmanagement_dns_DnsFree(void* pdata, int32_t freetype);
void windowssys_windows_win32_networkmanagement_dns_DnsFreeCustomServers(void* pcservers, void* ppservers);
void windowssys_windows_win32_networkmanagement_dns_DnsFreeProxyName(void* proxyname);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsGetApplicationSettings(void* pcservers, void* ppdefaultservers, void* psettings);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsGetProxyInformation(void* hostname, void* proxyinformation, void* defaultproxyinformation, void* completionroutine, void* completioncontext);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_A(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_UTF8(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_W(void* paddrecords, void* pdeleterecords, uint32_t options, void* hcredentials, void* pextralist, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_A(void* pname1, void* pname2);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_W(void* pname1, void* pname2);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsQueryConfig(int32_t config, uint32_t flag, void* pwsadaptername, void* preserved, void* pbuffer, void* pbuflen);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsQueryEx(void* pqueryrequest, void* pqueryresults, void* pcancelhandle);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsQueryRaw(void* queryrequest, void* cancelhandle);
void windowssys_windows_win32_networkmanagement_dns_DnsQueryRawResultFree(void* queryresults);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsQuery_A(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsQuery_UTF8(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsQuery_W(void* pszname, uint16_t wtype, uint32_t options, void* pextra, void* ppqueryresults, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsRecordCompare(void* precord1, void* precord2);
void* windowssys_windows_win32_networkmanagement_dns_DnsRecordCopyEx(void* precord, int32_t charsetin, int32_t charsetout);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCompare(void* prr1, void* prr2, void* ppdiff1, void* ppdiff2);
void* windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCopyEx(void* precordset, int32_t charsetin, int32_t charsetout);
void* windowssys_windows_win32_networkmanagement_dns_DnsRecordSetDetach(void* precordlist);
void windowssys_windows_win32_networkmanagement_dns_DnsReleaseContextHandle(void* hcontext);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetA(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetUTF8(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetW(void* preplaceset, uint32_t options, void* hcontext, void* pextrainfo, void* preserved);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowse(void* prequest, void* pcancel);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowseCancel(void* pcancelhandle);
void* windowssys_windows_win32_networkmanagement_dns_DnsServiceConstructInstance(void* pservicename, void* phostname, void* pip4, void* pip6, uint16_t wport, uint16_t wpriority, uint16_t wweight, uint32_t dwpropertiescount, void* keys, void* values);
void* windowssys_windows_win32_networkmanagement_dns_DnsServiceCopyInstance(void* porig);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceDeRegister(void* prequest, void* pcancel);
void windowssys_windows_win32_networkmanagement_dns_DnsServiceFreeInstance(void* pinstance);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceRegister(void* prequest, void* pcancel);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceRegisterCancel(void* pcancelhandle);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceResolve(void* prequest, void* pcancel);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsServiceResolveCancel(void* pcancelhandle);
uint32_t windowssys_windows_win32_networkmanagement_dns_DnsSetApplicationSettings(uint32_t cservers, void* pservers, void* psettings);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsStartMulticastQuery(void* pqueryrequest, void* phandle);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsStopMulticastQuery(void* phandle);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsValidateName_A(void* pszname, int32_t format);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsValidateName_UTF8(void* pszname, int32_t format);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsValidateName_W(void* pszname, int32_t format);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_UTF8(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired);
int32_t windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_W(void* pdnsbuffer, void* pdwbuffersize, void* pszname, uint16_t wtype, uint16_t xid, int32_t frecursiondesired);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WINDOWS_WIN32_NETWORKMANAGEMENT_DNS_WRAPPER_H */
