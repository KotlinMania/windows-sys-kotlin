#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache(void* requestqueuehandle, void* urlprefix, void* datachunk, void* cachepolicy, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpAddUrl(void* requestqueuehandle, void* fullyqualifiedurl, void* reserved);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup(uint64_t urlgroupid, void* pfullyqualifiedurl, uint64_t urlcontext, uint32_t reserved);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest(void* requestqueuehandle, uint64_t requestid, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue(void* requestqueuehandle);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(uint64_t serversessionid);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(uint64_t urlgroupid);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle(void* requestqueuehandle, uint32_t reserved);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup(uint64_t serversessionid, void* purlgroupid, uint32_t reserved);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpDeclarePush(void* requestqueuehandle, uint64_t requestid, int32_t verb, void* path, void* query, void* headers);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx(void* requestqueuehandle, void* delegatequeuehandle, uint64_t requestid, uint64_t delegateurlgroupid, uint32_t propertyinfosetsize, void* propertyinfoset);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration(void* servicehandle, int32_t configid, void* pconfiginformation, uint32_t configinformationlength, void* poverlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId(void* fullyqualifiedurl, void* requestqueuehandle, void* urlgroupid);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache(void* requestqueuehandle, void* urlprefix, uint32_t flags, void* overlapped);
int32_t windowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(int32_t featureid);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl(void* reserved, uint32_t flags, void* url, void* preparedurl);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty(void* requestqueuehandle, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, uint32_t reserved1, void* returnlength, void* reserved2);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty(uint64_t serversessionid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, void* returnlength);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration(void* servicehandle, int32_t configid, void* pinput, uint32_t inputlength, void* poutput, uint32_t outputlength, void* preturnlength, void* poverlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty(uint64_t urlgroupid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, void* returnlength);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache(void* requestqueuehandle, void* urlprefix, void* byterange, void* buffer, uint32_t bufferlength, void* bytesread, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate(void* requestqueuehandle, uint64_t connectionid, uint32_t flags, void* sslclientcertinfo, uint32_t sslclientcertinfosize, void* bytesreceived, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* requestbuffer, uint32_t requestbufferlength, void* bytesreturned, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* entitybuffer, uint32_t entitybufferlength, void* bytesreturned, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl(void* requestqueuehandle, void* fullyqualifiedurl);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup(uint64_t urlgroupid, void* pfullyqualifiedurl, uint32_t flags);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* httpresponse, void* cachepolicy, void* bytessent, void* reserved1, uint32_t reserved2, void* overlapped, void* logdata);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody(void* requestqueuehandle, uint64_t requestid, uint32_t flags, uint16_t entitychunkcount, void* entitychunks, void* bytessent, void* reserved1, uint32_t reserved2, void* overlapped, void* logdata);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty(void* requestqueuehandle, uint64_t id, int32_t propertyid, void* input, uint32_t inputpropertysize, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty(void* requestqueuehandle, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, uint32_t reserved1, void* reserved2);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty(uint64_t serversessionid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration(void* servicehandle, int32_t configid, void* pconfiginformation, uint32_t configinformationlength, void* poverlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty(uint64_t urlgroupid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue(void* requestqueuehandle);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpTerminate(uint32_t flags, void* preserved);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration(void* handle, int32_t configid, void* configinfo, uint32_t configinfolength, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart(void* requestqueuehandle, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect(void* requestqueuehandle, uint64_t connectionid, void* overlapped);
uint32_t windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx(void* requestqueuehandle, uint64_t connectionid, uint32_t reserved, void* overlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WRAPPER_H */
