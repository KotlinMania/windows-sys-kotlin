#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_storage_installablefilesystems_FilterAttach(void* lpfiltername, void* lpvolumename, void* lpinstancename, uint32_t dwcreatedinstancenamelength, void* lpcreatedinstancename);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterAttachAtAltitude(void* lpfiltername, void* lpvolumename, void* lpaltitude, void* lpinstancename, uint32_t dwcreatedinstancenamelength, void* lpcreatedinstancename);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterClose(int64_t hfilter);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterConnectCommunicationPort(void* lpportname, uint32_t dwoptions, void* lpcontext, uint16_t wsizeofcontext, void* lpsecurityattributes, void* hport);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterCreate(void* lpfiltername, void* hfilter);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterDetach(void* lpfiltername, void* lpvolumename, void* lpinstancename);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterFindClose(void* hfilterfind);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterFindFirst(int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpfilterfind);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterFindNext(void* hfilterfind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterGetDosName(void* lpvolumename, void* lpdosname, uint32_t dwdosnamebuffersize);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterGetInformation(int64_t hfilter, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterGetMessage(void* hport, void* lpmessagebuffer, uint32_t dwmessagebuffersize, void* lpoverlapped);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceClose(int64_t hinstance);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceCreate(void* lpfiltername, void* lpvolumename, void* lpinstancename, void* hinstance);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindClose(void* hfilterinstancefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindFirst(void* lpfiltername, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpfilterinstancefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindNext(void* hfilterinstancefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterInstanceGetInformation(int64_t hinstance, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterLoad(void* lpfiltername);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterReplyMessage(void* hport, void* lpreplybuffer, uint32_t dwreplybuffersize);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterSendMessage(void* hport, void* lpinbuffer, uint32_t dwinbuffersize, void* lpoutbuffer, uint32_t dwoutbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterUnload(void* lpfiltername);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindClose(void* hvolumefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindFirst(int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpvolumefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindNext(void* hvolumefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindClose(void* hvolumeinstancefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindFirst(void* lpvolumename, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned, void* lpvolumeinstancefind);
int32_t windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindNext(void* hvolumeinstancefind, int32_t dwinformationclass, void* lpbuffer, uint32_t dwbuffersize, void* lpbytesreturned);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WINDOWS_WIN32_STORAGE_INSTALLABLEFILESYSTEMS_WRAPPER_H */
