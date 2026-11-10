#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_storage_installablefilesystems_filterAttach(void* lpfiltername, void* lpvolumename, void* lpinstancename, uint32_t dwcreatedinstancenamelength, void* lpcreatedinstancename);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterAttachAtAltitude(void* lpfiltername, void* lpvolumename, void* lpaltitude, void* lpinstancename, uint32_t dwcreatedinstancenamelength, void* lpcreatedinstancename);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterClose(int64_t hfilter);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterConnectCommunicationPort(void* lpportname, uint32_t dwoptions, void* lpcontext, uint16_t wsizeofcontext, void* lpsecurityattributes, void* hport);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterCreate(void* lpfiltername, void* hfilter);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterDetach(void* lpfiltername, void* lpvolumename, void* lpinstancename);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterFindClose(void* hfilterfind);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterFindFirst(int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpfilterfind);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterFindNext(void* hfilterfind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterGetDosName(void* lpvolumename, void* lpdosname, uint32_t dwdosnamebuffersize);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterGetInformation(int64_t hfilter, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterGetMessage(void* hport, void* lpmessagebuffer, uint32_t dwmessagebuffersize, void* lpoverlapped);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterInstanceClose(int64_t hinstance);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterInstanceCreate(void* lpfiltername, void* lpvolumename, void* lpinstancename, void* hinstance);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindClose(void* hfilterinstancefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindFirst(void* lpfiltername, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpfilterinstancefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterInstanceFindNext(void* hfilterinstancefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterInstanceGetInformation(int64_t hinstance, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterLoad(void* lpfiltername);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterReplyMessage(void* hport, void* lpreplybuffer, uint32_t dwreplybuffersize);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterSendMessage(void* hport, void* lpinbuffer, uint32_t dwinbuffersize, void* lpoutbuffer, uint32_t dwoutbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterUnload(void* lpfiltername);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindClose(void* hvolumefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindFirst(int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpvolumefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterVolumeFindNext(void* hvolumefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindClose(void* hvolumeinstancefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindFirst(void* lpvolumename, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpvolumeinstancefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_filterVolumeInstanceFindNext(void* hvolumeinstancefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WRAPPER_H */
