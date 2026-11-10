#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networking_httpserver_httpAddFragmentToCache(void* requestqueuehandle, void* urlprefix, void* datachunk, void* cachepolicy, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpAddUrl(void* requestqueuehandle, void* fullyqualifiedurl, void* reserved);
uint32_t windowssys_windows_win32_networking_httpserver_httpAddUrlToUrlGroup(uint64_t urlgroupid, void* pfullyqualifiedurl, uint64_t urlcontext, uint32_t reserved);
uint32_t windowssys_windows_win32_networking_httpserver_httpCancelHttpRequest(void* requestqueuehandle, uint64_t requestid, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpCloseRequestQueue(void* requestqueuehandle);
uint32_t windowssys_windows_win32_networking_httpserver_httpCloseServerSession(uint64_t serversessionid);
uint32_t windowssys_windows_win32_networking_httpserver_httpCloseUrlGroup(uint64_t urlgroupid);
uint32_t windowssys_windows_win32_networking_httpserver_httpCreateHttpHandle(void* requestqueuehandle, uint32_t reserved);
uint32_t windowssys_windows_win32_networking_httpserver_httpCreateUrlGroup(uint64_t serversessionid, void* purlgroupid, uint32_t reserved);
uint32_t windowssys_windows_win32_networking_httpserver_httpDeclarePush(void* requestqueuehandle, uint64_t requestid, int32_t verb, void* path, void* query, void* headers);
uint32_t windowssys_windows_win32_networking_httpserver_httpDelegateRequestEx(void* requestqueuehandle, void* delegatequeuehandle, uint64_t requestid, uint64_t delegateurlgroupid, uint32_t propertyinfosetsize, void* propertyinfoset);
uint32_t windowssys_windows_win32_networking_httpserver_httpDeleteServiceConfiguration(void* servicehandle, int32_t configid, void* pconfiginformation, uint32_t configinformationlength, void* poverlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpFindUrlGroupId(void* fullyqualifiedurl, void* requestqueuehandle, void* urlgroupid);
uint32_t windowssys_windows_win32_networking_httpserver_httpFlushResponseCache(void* requestqueuehandle, void* urlprefix, uint32_t flags, void* overlapped);
int32_t windowssys_windows_win32_networking_httpserver_httpIsFeatureSupported(int32_t featureid);
uint32_t windowssys_windows_win32_networking_httpserver_httpPrepareUrl(void* reserved, uint32_t flags, void* url, void* preparedurl);
uint32_t windowssys_windows_win32_networking_httpserver_httpQueryRequestQueueProperty(void* requestqueuehandle, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, uint32_t reserved1, void* returnlength, void* reserved2);
uint32_t windowssys_windows_win32_networking_httpserver_httpQueryServerSessionProperty(uint64_t serversessionid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, void* returnlength);
uint32_t windowssys_windows_win32_networking_httpserver_httpQueryServiceConfiguration(void* servicehandle, int32_t configid, void* pinput, uint32_t inputlength, void* poutput, uint32_t outputlength, void* preturnlength, void* poverlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpQueryUrlGroupProperty(uint64_t urlgroupid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, void* returnlength);
uint32_t windowssys_windows_win32_networking_httpserver_httpReadFragmentFromCache(void* requestqueuehandle, void* urlprefix, void* byterange, void* buffer, uint32_t bufferlength, void* bytesread, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpReceiveClientCertificate(void* requestqueuehandle, uint64_t connectionid, uint32_t flags, void* sslclientcertinfo, uint32_t sslclientcertinfosize, void* bytesreceived, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpReceiveHttpRequest(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* requestbuffer, uint32_t requestbufferlength, void* bytesreturned, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpReceiveRequestEntityBody(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* entitybuffer, uint32_t entitybufferlength, void* bytesreturned, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpRemoveUrl(void* requestqueuehandle, void* fullyqualifiedurl);
uint32_t windowssys_windows_win32_networking_httpserver_httpRemoveUrlFromUrlGroup(uint64_t urlgroupid, void* pfullyqualifiedurl, uint32_t flags);
uint32_t windowssys_windows_win32_networking_httpserver_httpSendHttpResponse(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* httpresponse, void* cachepolicy, void* bytessent, void* reserved1, uint32_t reserved2, void* overlapped, void* logdata);
uint32_t windowssys_windows_win32_networking_httpserver_httpSendResponseEntityBody(void* requestqueuehandle, uint64_t requestid, uint32_t flags, uint16_t entitychunkcount, void* entitychunks, void* bytessent, void* reserved1, uint32_t reserved2, void* overlapped, void* logdata);
uint32_t windowssys_windows_win32_networking_httpserver_httpSetRequestProperty(void* requestqueuehandle, uint64_t id, int32_t propertyid, void* input, uint32_t inputpropertysize, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpSetRequestQueueProperty(void* requestqueuehandle, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, uint32_t reserved1, void* reserved2);
uint32_t windowssys_windows_win32_networking_httpserver_httpSetServerSessionProperty(uint64_t serversessionid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength);
uint32_t windowssys_windows_win32_networking_httpserver_httpSetServiceConfiguration(void* servicehandle, int32_t configid, void* pconfiginformation, uint32_t configinformationlength, void* poverlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpSetUrlGroupProperty(uint64_t urlgroupid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength);
uint32_t windowssys_windows_win32_networking_httpserver_httpShutdownRequestQueue(void* requestqueuehandle);
uint32_t windowssys_windows_win32_networking_httpserver_httpTerminate(uint32_t flags, void* preserved);
uint32_t windowssys_windows_win32_networking_httpserver_httpUpdateServiceConfiguration(void* handle, int32_t configid, void* configinfo, uint32_t configinfolength, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpWaitForDemandStart(void* requestqueuehandle, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpWaitForDisconnect(void* requestqueuehandle, uint64_t connectionid, void* overlapped);
uint32_t windowssys_windows_win32_networking_httpserver_httpWaitForDisconnectEx(void* requestqueuehandle, uint64_t connectionid, uint32_t reserved, void* overlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WINDOWS_WIN32_NETWORKING_HTTPSERVER_WRAPPER_H */
