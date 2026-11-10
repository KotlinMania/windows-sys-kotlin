#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTLOG_WINDOWS_WIN32_SYSTEM_EVENTLOG_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTLOG_WINDOWS_WIN32_SYSTEM_EVENTLOG_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_eventlog_backupEventLogA(void* heventlog, void* lpbackupfilename);
int32_t windowssys_windows_win32_system_eventlog_backupEventLogW(void* heventlog, void* lpbackupfilename);
int32_t windowssys_windows_win32_system_eventlog_clearEventLogA(void* heventlog, void* lpbackupfilename);
int32_t windowssys_windows_win32_system_eventlog_clearEventLogW(void* heventlog, void* lpbackupfilename);
int32_t windowssys_windows_win32_system_eventlog_closeEventLog(void* heventlog);
int32_t windowssys_windows_win32_system_eventlog_deregisterEventSource(void* heventlog);
int32_t windowssys_windows_win32_system_eventlog_evtArchiveExportedLog(int64_t session, void* logfilepath, uint32_t locale, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_evtCancel(int64_t object);
int32_t windowssys_windows_win32_system_eventlog_evtClearLog(int64_t session, void* channelpath, void* targetfilepath, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_evtClose(int64_t object);
int64_t windowssys_windows_win32_system_eventlog_evtCreateBookmark(void* bookmarkxml);
int64_t windowssys_windows_win32_system_eventlog_evtCreateRenderContext(uint32_t valuepathscount, void* valuepaths, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_evtExportLog(int64_t session, void* path, void* query, void* targetfilepath, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_evtFormatMessage(int64_t publishermetadata, int64_t event, uint32_t messageid, uint32_t valuecount, void* values, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused);
int32_t windowssys_windows_win32_system_eventlog_evtGetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_evtGetEventInfo(int64_t event, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_evtGetEventMetadataProperty(int64_t eventmetadata, int32_t propertyid, uint32_t flags, uint32_t eventmetadatapropertybuffersize, void* eventmetadatapropertybuffer, void* eventmetadatapropertybufferused);
uint32_t windowssys_windows_win32_system_eventlog_evtGetExtendedStatus(uint32_t buffersize, void* buffer, void* bufferused);
int32_t windowssys_windows_win32_system_eventlog_evtGetLogInfo(int64_t arg_0_log, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_evtGetObjectArrayProperty(int64_t objectarray, uint32_t propertyid, uint32_t arrayindex, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_evtGetObjectArraySize(int64_t objectarray, void* objectarraysize);
int32_t windowssys_windows_win32_system_eventlog_evtGetPublisherMetadataProperty(int64_t publishermetadata, int32_t propertyid, uint32_t flags, uint32_t publishermetadatapropertybuffersize, void* publishermetadatapropertybuffer, void* publishermetadatapropertybufferused);
int32_t windowssys_windows_win32_system_eventlog_evtGetQueryInfo(int64_t queryorsubscription, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_evtNext(int64_t resultset, uint32_t eventssize, void* events, uint32_t timeout, uint32_t flags, void* returned);
int32_t windowssys_windows_win32_system_eventlog_evtNextChannelPath(int64_t channelenum, uint32_t channelpathbuffersize, void* channelpathbuffer, void* channelpathbufferused);
int64_t windowssys_windows_win32_system_eventlog_evtNextEventMetadata(int64_t eventmetadataenum, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_evtNextPublisherId(int64_t publisherenum, uint32_t publisheridbuffersize, void* publisheridbuffer, void* publisheridbufferused);
int64_t windowssys_windows_win32_system_eventlog_evtOpenChannelConfig(int64_t session, void* channelpath, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_evtOpenChannelEnum(int64_t session, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_evtOpenEventMetadataEnum(int64_t publishermetadata, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_evtOpenLog(int64_t session, void* path, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_evtOpenPublisherEnum(int64_t session, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_evtOpenPublisherMetadata(int64_t session, void* publisherid, void* logfilepath, uint32_t locale, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_evtOpenSession(int32_t loginclass, void* login, uint32_t timeout, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_evtQuery(int64_t session, void* path, void* query, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_evtRender(int64_t context, int64_t fragment, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused, void* propertycount);
int32_t windowssys_windows_win32_system_eventlog_evtSaveChannelConfig(int64_t channelconfig, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_evtSeek(int64_t resultset, int64_t position, int64_t bookmark, uint32_t timeout, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_evtSetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, void* propertyvalue);
int64_t windowssys_windows_win32_system_eventlog_evtSubscribe(int64_t session, void* signalevent, void* channelpath, void* query, int64_t bookmark, void* context, void* callback, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_evtUpdateBookmark(int64_t bookmark, int64_t event);
int32_t windowssys_windows_win32_system_eventlog_getEventLogInformation(void* heventlog, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_eventlog_getNumberOfEventLogRecords(void* heventlog, void* numberofrecords);
int32_t windowssys_windows_win32_system_eventlog_getOldestEventLogRecord(void* heventlog, void* oldestrecord);
int32_t windowssys_windows_win32_system_eventlog_notifyChangeEventLog(void* heventlog, void* hevent);
void* windowssys_windows_win32_system_eventlog_openBackupEventLogA(void* lpuncservername, void* lpfilename);
void* windowssys_windows_win32_system_eventlog_openBackupEventLogW(void* lpuncservername, void* lpfilename);
void* windowssys_windows_win32_system_eventlog_openEventLogA(void* lpuncservername, void* lpsourcename);
void* windowssys_windows_win32_system_eventlog_openEventLogW(void* lpuncservername, void* lpsourcename);
int32_t windowssys_windows_win32_system_eventlog_readEventLogA(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded);
int32_t windowssys_windows_win32_system_eventlog_readEventLogW(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded);
void* windowssys_windows_win32_system_eventlog_registerEventSourceA(void* lpuncservername, void* lpsourcename);
void* windowssys_windows_win32_system_eventlog_registerEventSourceW(void* lpuncservername, void* lpsourcename);
int32_t windowssys_windows_win32_system_eventlog_reportEventA(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata);
int32_t windowssys_windows_win32_system_eventlog_reportEventW(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTLOG_WINDOWS_WIN32_SYSTEM_EVENTLOG_WRAPPER_H */
