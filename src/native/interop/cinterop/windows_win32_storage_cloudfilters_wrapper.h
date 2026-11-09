#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_storage_cloudfilters_CfCloseHandle(void* filehandle);
int32_t windowssys_windows_win32_storage_cloudfilters_CfConnectSyncRoot(void* syncrootpath, void* callbacktable, void* callbackcontext, int32_t connectflags, void* connectionkey);
int32_t windowssys_windows_win32_storage_cloudfilters_CfConvertToPlaceholder(void* filehandle, void* fileidentity, uint32_t fileidentitylength, int32_t convertflags, void* convertusn, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_CfCreatePlaceholders(void* basedirectorypath, void* placeholderarray, uint32_t placeholdercount, int32_t createflags, void* entriesprocessed);
int32_t windowssys_windows_win32_storage_cloudfilters_CfDehydratePlaceholder(void* filehandle, int64_t startingoffset, int64_t length, int32_t dehydrateflags, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_CfDisconnectSyncRoot(int64_t connectionkey);
int32_t windowssys_windows_win32_storage_cloudfilters_CfExecute(void* opinfo, void* opparams);
int32_t windowssys_windows_win32_storage_cloudfilters_CfGetCorrelationVector(void* filehandle, void* correlationvector);
int32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderInfo(void* filehandle, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfo(void* filehandle, int32_t infoclass, int64_t startingoffset, int64_t length, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfoForHydration(int64_t connectionkey, int64_t transferkey, int64_t fileid, int32_t infoclass, int64_t startingoffset, int64_t rangelength, void* infobuffer, uint32_t infobuffersize, void* infobufferwritten);
uint32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromAttributeTag(uint32_t fileattributes, uint32_t reparsetag);
uint32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFileInfo(void* infobuffer, int32_t infoclass);
uint32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFindData(void* finddata);
int32_t windowssys_windows_win32_storage_cloudfilters_CfGetPlatformInfo(void* platformversion);
int32_t windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByHandle(void* filehandle, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByPath(void* filepath, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssys_windows_win32_storage_cloudfilters_CfGetTransferKey(void* filehandle, void* transferkey);
void* windowssys_windows_win32_storage_cloudfilters_CfGetWin32HandleFromProtectedHandle(void* protectedhandle);
int32_t windowssys_windows_win32_storage_cloudfilters_CfHydratePlaceholder(void* filehandle, int64_t startingoffset, int64_t length, int32_t hydrateflags, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_CfOpenFileWithOplock(void* filepath, int32_t flags, void* protectedhandle);
int32_t windowssys_windows_win32_storage_cloudfilters_CfQuerySyncProviderStatus(int64_t connectionkey, void* providerstatus);
bool windowssys_windows_win32_storage_cloudfilters_CfReferenceProtectedHandle(void* protectedhandle);
int32_t windowssys_windows_win32_storage_cloudfilters_CfRegisterSyncRoot(void* syncrootpath, void* registration, void* policies, int32_t registerflags);
void windowssys_windows_win32_storage_cloudfilters_CfReleaseProtectedHandle(void* protectedhandle);
void windowssys_windows_win32_storage_cloudfilters_CfReleaseTransferKey(void* filehandle, void* transferkey);
int32_t windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress(int64_t connectionkey, int64_t transferkey, int64_t providerprogresstotal, int64_t providerprogresscompleted);
int32_t windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress2(int64_t connectionkey, int64_t transferkey, int64_t requestkey, int64_t providerprogresstotal, int64_t providerprogresscompleted, uint32_t targetsessionid);
int32_t windowssys_windows_win32_storage_cloudfilters_CfReportSyncStatus(void* syncrootpath, void* syncstatus);
int32_t windowssys_windows_win32_storage_cloudfilters_CfRevertPlaceholder(void* filehandle, int32_t revertflags, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_CfSetCorrelationVector(void* filehandle, void* correlationvector);
int32_t windowssys_windows_win32_storage_cloudfilters_CfSetInSyncState(void* filehandle, int32_t insyncstate, int32_t insyncflags, void* insyncusn);
int32_t windowssys_windows_win32_storage_cloudfilters_CfSetPinState(void* filehandle, int32_t pinstate, int32_t pinflags, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_CfUnregisterSyncRoot(void* syncrootpath);
int32_t windowssys_windows_win32_storage_cloudfilters_CfUpdatePlaceholder(void* filehandle, void* fsmetadata, void* fileidentity, uint32_t fileidentitylength, void* dehydraterangearray, uint32_t dehydraterangecount, int32_t updateflags, void* updateusn, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_CfUpdateSyncProviderStatus(int64_t connectionkey, uint32_t providerstatus);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WRAPPER_H */
