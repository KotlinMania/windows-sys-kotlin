#ifndef WINDOWSSYS_WINDOWS_WIN32_MEDIA_WINDOWSMEDIAFORMAT_WINDOWS_WIN32_MEDIA_WINDOWSMEDIAFORMAT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_MEDIA_WINDOWSMEDIAFORMAT_WINDOWS_WIN32_MEDIA_WINDOWSMEDIAFORMAT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer(void* pcallback, void* ppbackup);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor(void* ppeditor);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer(void* ppindexer);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager(void* ppprofilemanager);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateReader(void* punkcert, uint32_t dwrights, void* ppreader);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader(void* punkcert, uint32_t dwrights, void* ppsyncreader);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter(void* punkcert, void* ppwriter);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink(void* ppsink);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink(void* ppsink);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink(void* ppsink);
int32_t windowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected(void* pwszfilename, void* pfisprotected);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_MEDIA_WINDOWSMEDIAFORMAT_WINDOWS_WIN32_MEDIA_WINDOWSMEDIAFORMAT_WRAPPER_H */
