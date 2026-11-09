#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networking_httpserver_HttpAddFragmentToCache(void* requestqueuehandle, void* urlprefix, void* datachunk, void* cachepolicy, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpAddUrl(void* requestqueuehandle, void* fullyqualifiedurl, void* reserved);
uint32_t windowssys_windows_win32_networking_httpserver_HttpAddUrlToUrlGroup(uint64_t urlgroupid, void* pfullyqualifiedurl, uint64_t urlcontext, uint32_t reserved);
uint32_t windowssys_windows_win32_networking_httpserver_HttpCancelHttpRequest(void* requestqueuehandle, uint64_t requestid, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpCloseRequestQueue(void* requestqueuehandle);
uint32_t windowssys_windows_win32_networking_httpserver_HttpCloseServerSession(uint64_t serversessionid);
uint32_t windowssys_windows_win32_networking_httpserver_HttpCloseUrlGroup(uint64_t urlgroupid);
uint32_t windowssys_windows_win32_networking_httpserver_HttpCreateHttpHandle(void* requestqueuehandle, uint32_t reserved);
uint32_t windowssys_windows_win32_networking_httpserver_HttpCreateUrlGroup(uint64_t serversessionid, void* purlgroupid, uint32_t reserved);
uint32_t windowssys_windows_win32_networking_httpserver_HttpDeclarePush(void* requestqueuehandle, uint64_t requestid, int32_t verb, void* path, void* query, void* headers);
uint32_t windowssys_windows_win32_networking_httpserver_HttpDelegateRequestEx(void* requestqueuehandle, void* delegatequeuehandle, uint64_t requestid, uint64_t delegateurlgroupid, uint32_t propertyinfosetsize, void* propertyinfoset);
uint32_t windowssys_windows_win32_networking_httpserver_HttpDeleteServiceConfiguration(void* servicehandle, int32_t configid, void* pconfiginformation, uint32_t configinformationlength, void* poverlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpFindUrlGroupId(void* fullyqualifiedurl, void* requestqueuehandle, void* urlgroupid);
uint32_t windowssys_windows_win32_networking_httpserver_HttpFlushResponseCache(void* requestqueuehandle, void* urlprefix, uint32_t flags, void* overlapped);
int32_t windowssys_windows_win32_networking_httpserver_HttpIsFeatureSupported(int32_t featureid);
uint32_t windowssys_windows_win32_networking_httpserver_HttpPrepareUrl(void* reserved, uint32_t flags, void* url, void* preparedurl);
uint32_t windowssys_windows_win32_networking_httpserver_HttpQueryRequestQueueProperty(void* requestqueuehandle, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, uint32_t reserved1, void* returnlength, void* reserved2);
uint32_t windowssys_windows_win32_networking_httpserver_HttpQueryServerSessionProperty(uint64_t serversessionid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, void* returnlength);
uint32_t windowssys_windows_win32_networking_httpserver_HttpQueryServiceConfiguration(void* servicehandle, int32_t configid, void* pinput, uint32_t inputlength, void* poutput, uint32_t outputlength, void* preturnlength, void* poverlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpQueryUrlGroupProperty(uint64_t urlgroupid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, void* returnlength);
uint32_t windowssys_windows_win32_networking_httpserver_HttpReadFragmentFromCache(void* requestqueuehandle, void* urlprefix, void* byterange, void* buffer, uint32_t bufferlength, void* bytesread, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpReceiveClientCertificate(void* requestqueuehandle, uint64_t connectionid, uint32_t flags, void* sslclientcertinfo, uint32_t sslclientcertinfosize, void* bytesreceived, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpReceiveHttpRequest(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* requestbuffer, uint32_t requestbufferlength, void* bytesreturned, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpReceiveRequestEntityBody(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* entitybuffer, uint32_t entitybufferlength, void* bytesreturned, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpRemoveUrl(void* requestqueuehandle, void* fullyqualifiedurl);
uint32_t windowssys_windows_win32_networking_httpserver_HttpRemoveUrlFromUrlGroup(uint64_t urlgroupid, void* pfullyqualifiedurl, uint32_t flags);
uint32_t windowssys_windows_win32_networking_httpserver_HttpSendHttpResponse(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* httpresponse, void* cachepolicy, void* bytessent, void* reserved1, uint32_t reserved2, void* overlapped, void* logdata);
uint32_t windowssys_windows_win32_networking_httpserver_HttpSendResponseEntityBody(void* requestqueuehandle, uint64_t requestid, uint32_t flags, uint16_t entitychunkcount, void* entitychunks, void* bytessent, void* reserved1, uint32_t reserved2, void* overlapped, void* logdata);
uint32_t windowssys_windows_win32_networking_httpserver_HttpSetRequestProperty(void* requestqueuehandle, uint64_t id, int32_t propertyid, void* input, uint32_t inputpropertysize, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpSetRequestQueueProperty(void* requestqueuehandle, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, uint32_t reserved1, void* reserved2);
uint32_t windowssys_windows_win32_networking_httpserver_HttpSetServerSessionProperty(uint64_t serversessionid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength);
uint32_t windowssys_windows_win32_networking_httpserver_HttpSetServiceConfiguration(void* servicehandle, int32_t configid, void* pconfiginformation, uint32_t configinformationlength, void* poverlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpSetUrlGroupProperty(uint64_t urlgroupid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength);
uint32_t windowssys_windows_win32_networking_httpserver_HttpShutdownRequestQueue(void* requestqueuehandle);
uint32_t windowssys_windows_win32_networking_httpserver_HttpTerminate(uint32_t flags, void* preserved);
uint32_t windowssys_windows_win32_networking_httpserver_HttpUpdateServiceConfiguration(void* handle, int32_t configid, void* configinfo, uint32_t configinfolength, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpWaitForDemandStart(void* requestqueuehandle, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnect(void* requestqueuehandle, uint64_t connectionid, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnectEx(void* requestqueuehandle, uint64_t connectionid, uint32_t reserved, void* overlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WRAPPER_H */
