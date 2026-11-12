#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterAttach(void* lpfiltername, void* lpvolumename, void* lpinstancename, uint32_t dwcreatedinstancenamelength, void* lpcreatedinstancename);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude(void* lpfiltername, void* lpvolumename, void* lpaltitude, void* lpinstancename, uint32_t dwcreatedinstancenamelength, void* lpcreatedinstancename);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterClose(int64_t hfilter);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort(void* lpportname, uint32_t dwoptions, void* lpcontext, uint16_t wsizeofcontext, void* lpsecurityattributes, void* hport);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterCreate(void* lpfiltername, void* hfilter);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterDetach(void* lpfiltername, void* lpvolumename, void* lpinstancename);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose(void* hfilterfind);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst(int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpfilterfind);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext(void* hfilterfind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName(void* lpvolumename, void* lpdosname, uint32_t dwdosnamebuffersize);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation(int64_t hfilter, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage(void* hport, void* lpmessagebuffer, uint32_t dwmessagebuffersize, void* lpoverlapped);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(int64_t hinstance);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate(void* lpfiltername, void* lpvolumename, void* lpinstancename, void* hinstance);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose(void* hfilterinstancefind);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst(void* lpfiltername, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpfilterinstancefind);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext(void* hfilterinstancefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation(int64_t hinstance, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterLoad(void* lpfiltername);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage(void* hport, void* lpreplybuffer, uint32_t dwreplybuffersize);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage(void* hport, void* lpinbuffer, uint32_t dwinbuffersize, void* lpoutbuffer, uint32_t dwoutbuffersize, void* lpbytesreturned);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterUnload(void* lpfiltername);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose(void* hvolumefind);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst(int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpvolumefind);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext(void* hvolumefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose(void* hvolumeinstancefind);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst(void* lpvolumename, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpvolumeinstancefind);
int32_t windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext(void* hvolumeinstancefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WRAPPER_H */
