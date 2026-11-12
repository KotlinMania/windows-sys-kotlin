#ifndef WINDOWSSYS_WINDOWS_WIN32_MEDIA_AUDIO_WINDOWS_WIN32_MEDIA_AUDIO_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_MEDIA_AUDIO_WINDOWS_WIN32_MEDIA_AUDIO_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync(void* deviceinterfacepath, void* riid, void* activationparams, void* completionhandler, void* activationoperation);
int32_t windowssysWindowsWin32MediaAudioCoRegisterMessageFilter(void* lpmessagefilter, void* lplpmessagefilter);
int32_t windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor(void* audiostatemonitor);
int32_t windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory(int32_t category, void* audiostatemonitor);
int32_t windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId(int32_t category, void* deviceid, void* audiostatemonitor);
int32_t windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole(int32_t category, int32_t role, void* audiostatemonitor);
int32_t windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor(void* audiostatemonitor);
int32_t windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory(int32_t category, void* audiostatemonitor);
int32_t windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId(int32_t category, void* deviceid, void* audiostatemonitor);
int32_t windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole(int32_t category, int32_t role, void* audiostatemonitor);
int32_t windowssysWindowsWin32MediaAudioPlaySoundA(void* pszsound, void* hmod, uint32_t fdwsound);
int32_t windowssysWindowsWin32MediaAudioPlaySoundW(void* pszsound, void* hmod, uint32_t fdwsound);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverAddA(void* phadid, void* hinstmodule, int64_t lparam, uint32_t dwpriority, uint32_t fdwadd);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverAddW(void* phadid, void* hinstmodule, int64_t lparam, uint32_t dwpriority, uint32_t fdwadd);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverClose(void* had, uint32_t fdwclose);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverDetailsA(void* hadid, void* padd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverDetailsW(void* hadid, void* padd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverEnum(void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverID(void* hao, void* phadid, uint32_t fdwdriverid);
int64_t windowssysWindowsWin32MediaAudioAcmDriverMessage(void* had, uint32_t umsg, int64_t lparam1, int64_t lparam2);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverOpen(void* phad, void* hadid, uint32_t fdwopen);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverPriority(void* hadid, uint32_t dwpriority, uint32_t fdwpriority);
uint32_t windowssysWindowsWin32MediaAudioAcmDriverRemove(void* hadid, uint32_t fdwremove);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterChooseA(void* pafltrc);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterChooseW(void* pafltrc);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterDetailsA(void* had, void* pafd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterDetailsW(void* had, void* pafd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterEnumA(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterEnumW(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterTagDetailsA(void* had, void* paftd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterTagDetailsW(void* had, void* paftd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterTagEnumA(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssysWindowsWin32MediaAudioAcmFilterTagEnumW(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatChooseA(void* pafmtc);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatChooseW(void* pafmtc);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatDetailsA(void* had, void* pafd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatDetailsW(void* had, void* pafd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatEnumA(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatEnumW(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatSuggest(void* had, void* pwfxsrc, void* pwfxdst, uint32_t cbwfxdst, uint32_t fdwsuggest);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatTagDetailsA(void* had, void* paftd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatTagDetailsW(void* had, void* paftd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatTagEnumA(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssysWindowsWin32MediaAudioAcmFormatTagEnumW(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssysWindowsWin32MediaAudioAcmGetVersion(void);
uint32_t windowssysWindowsWin32MediaAudioAcmMetrics(void* hao, uint32_t umetric, void* pmetric);
uint32_t windowssysWindowsWin32MediaAudioAcmStreamClose(void* has, uint32_t fdwclose);
uint32_t windowssysWindowsWin32MediaAudioAcmStreamConvert(void* has, void* pash, uint32_t fdwconvert);
uint32_t windowssysWindowsWin32MediaAudioAcmStreamMessage(void* has, uint32_t umsg, int64_t lparam1, int64_t lparam2);
uint32_t windowssysWindowsWin32MediaAudioAcmStreamOpen(void* phas, void* had, void* pwfxsrc, void* pwfxdst, void* pwfltr, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssysWindowsWin32MediaAudioAcmStreamPrepareHeader(void* has, void* pash, uint32_t fdwprepare);
uint32_t windowssysWindowsWin32MediaAudioAcmStreamReset(void* has, uint32_t fdwreset);
uint32_t windowssysWindowsWin32MediaAudioAcmStreamSize(void* has, uint32_t cbinput, void* pdwoutputbytes, uint32_t fdwsize);
uint32_t windowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader(void* has, void* pash, uint32_t fdwunprepare);
uint32_t windowssysWindowsWin32MediaAudioAuxGetDevCapsA(uint64_t udeviceid, void* pac, uint32_t cbac);
uint32_t windowssysWindowsWin32MediaAudioAuxGetDevCapsW(uint64_t udeviceid, void* pac, uint32_t cbac);
uint32_t windowssysWindowsWin32MediaAudioAuxGetNumDevs(void);
uint32_t windowssysWindowsWin32MediaAudioAuxGetVolume(uint32_t udeviceid, void* pdwvolume);
uint32_t windowssysWindowsWin32MediaAudioAuxOutMessage(uint32_t udeviceid, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssysWindowsWin32MediaAudioAuxSetVolume(uint32_t udeviceid, uint32_t dwvolume);
uint32_t windowssysWindowsWin32MediaAudioMidiConnect(void* hmi, void* hmo, void* preserved);
uint32_t windowssysWindowsWin32MediaAudioMidiDisconnect(void* hmi, void* hmo, void* preserved);
uint32_t windowssysWindowsWin32MediaAudioMidiInAddBuffer(void* hmi, void* pmh, uint32_t cbmh);
uint32_t windowssysWindowsWin32MediaAudioMidiInClose(void* hmi);
uint32_t windowssysWindowsWin32MediaAudioMidiInGetDevCapsA(uint64_t udeviceid, void* pmic, uint32_t cbmic);
uint32_t windowssysWindowsWin32MediaAudioMidiInGetDevCapsW(uint64_t udeviceid, void* pmic, uint32_t cbmic);
uint32_t windowssysWindowsWin32MediaAudioMidiInGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssysWindowsWin32MediaAudioMidiInGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssysWindowsWin32MediaAudioMidiInGetID(void* hmi, void* pudeviceid);
uint32_t windowssysWindowsWin32MediaAudioMidiInGetNumDevs(void);
uint32_t windowssysWindowsWin32MediaAudioMidiInMessage(void* hmi, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssysWindowsWin32MediaAudioMidiInOpen(void* phmi, uint32_t udeviceid, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssysWindowsWin32MediaAudioMidiInPrepareHeader(void* hmi, void* pmh, uint32_t cbmh);
uint32_t windowssysWindowsWin32MediaAudioMidiInReset(void* hmi);
uint32_t windowssysWindowsWin32MediaAudioMidiInStart(void* hmi);
uint32_t windowssysWindowsWin32MediaAudioMidiInStop(void* hmi);
uint32_t windowssysWindowsWin32MediaAudioMidiInUnprepareHeader(void* hmi, void* pmh, uint32_t cbmh);
uint32_t windowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches(void* hmo, uint32_t upatch, void* pwkya, uint32_t fucache);
uint32_t windowssysWindowsWin32MediaAudioMidiOutCachePatches(void* hmo, uint32_t ubank, void* pwpa, uint32_t fucache);
uint32_t windowssysWindowsWin32MediaAudioMidiOutClose(void* hmo);
uint32_t windowssysWindowsWin32MediaAudioMidiOutGetDevCapsA(uint64_t udeviceid, void* pmoc, uint32_t cbmoc);
uint32_t windowssysWindowsWin32MediaAudioMidiOutGetDevCapsW(uint64_t udeviceid, void* pmoc, uint32_t cbmoc);
uint32_t windowssysWindowsWin32MediaAudioMidiOutGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssysWindowsWin32MediaAudioMidiOutGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssysWindowsWin32MediaAudioMidiOutGetID(void* hmo, void* pudeviceid);
uint32_t windowssysWindowsWin32MediaAudioMidiOutGetNumDevs(void);
uint32_t windowssysWindowsWin32MediaAudioMidiOutGetVolume(void* hmo, void* pdwvolume);
uint32_t windowssysWindowsWin32MediaAudioMidiOutLongMsg(void* hmo, void* pmh, uint32_t cbmh);
uint32_t windowssysWindowsWin32MediaAudioMidiOutMessage(void* hmo, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssysWindowsWin32MediaAudioMidiOutOpen(void* phmo, uint32_t udeviceid, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssysWindowsWin32MediaAudioMidiOutPrepareHeader(void* hmo, void* pmh, uint32_t cbmh);
uint32_t windowssysWindowsWin32MediaAudioMidiOutReset(void* hmo);
uint32_t windowssysWindowsWin32MediaAudioMidiOutSetVolume(void* hmo, uint32_t dwvolume);
uint32_t windowssysWindowsWin32MediaAudioMidiOutShortMsg(void* hmo, uint32_t dwmsg);
uint32_t windowssysWindowsWin32MediaAudioMidiOutUnprepareHeader(void* hmo, void* pmh, uint32_t cbmh);
uint32_t windowssysWindowsWin32MediaAudioMidiStreamClose(void* hms);
uint32_t windowssysWindowsWin32MediaAudioMidiStreamOpen(void* phms, void* pudeviceid, uint32_t cmidi, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssysWindowsWin32MediaAudioMidiStreamOut(void* hms, void* pmh, uint32_t cbmh);
uint32_t windowssysWindowsWin32MediaAudioMidiStreamPause(void* hms);
uint32_t windowssysWindowsWin32MediaAudioMidiStreamPosition(void* hms, void* lpmmt, uint32_t cbmmt);
uint32_t windowssysWindowsWin32MediaAudioMidiStreamProperty(void* hms, void* lppropdata, uint32_t dwproperty);
uint32_t windowssysWindowsWin32MediaAudioMidiStreamRestart(void* hms);
uint32_t windowssysWindowsWin32MediaAudioMidiStreamStop(void* hms);
uint32_t windowssysWindowsWin32MediaAudioMixerClose(void* hmx);
uint32_t windowssysWindowsWin32MediaAudioMixerGetControlDetailsA(void* hmxobj, void* pmxcd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioMixerGetControlDetailsW(void* hmxobj, void* pmxcd, uint32_t fdwdetails);
uint32_t windowssysWindowsWin32MediaAudioMixerGetDevCapsA(uint64_t umxid, void* pmxcaps, uint32_t cbmxcaps);
uint32_t windowssysWindowsWin32MediaAudioMixerGetDevCapsW(uint64_t umxid, void* pmxcaps, uint32_t cbmxcaps);
uint32_t windowssysWindowsWin32MediaAudioMixerGetID(void* hmxobj, void* pumxid, uint32_t fdwid);
uint32_t windowssysWindowsWin32MediaAudioMixerGetLineControlsA(void* hmxobj, void* pmxlc, uint32_t fdwcontrols);
uint32_t windowssysWindowsWin32MediaAudioMixerGetLineControlsW(void* hmxobj, void* pmxlc, uint32_t fdwcontrols);
uint32_t windowssysWindowsWin32MediaAudioMixerGetLineInfoA(void* hmxobj, void* pmxl, uint32_t fdwinfo);
uint32_t windowssysWindowsWin32MediaAudioMixerGetLineInfoW(void* hmxobj, void* pmxl, uint32_t fdwinfo);
uint32_t windowssysWindowsWin32MediaAudioMixerGetNumDevs(void);
uint32_t windowssysWindowsWin32MediaAudioMixerMessage(void* hmx, uint32_t umsg, uint64_t dwparam1, uint64_t dwparam2);
uint32_t windowssysWindowsWin32MediaAudioMixerOpen(void* phmx, uint32_t umxid, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssysWindowsWin32MediaAudioMixerSetControlDetails(void* hmxobj, void* pmxcd, uint32_t fdwdetails);
int32_t windowssysWindowsWin32MediaAudioSndPlaySoundA(void* pszsound, uint32_t fusound);
int32_t windowssysWindowsWin32MediaAudioSndPlaySoundW(void* pszsound, uint32_t fusound);
uint32_t windowssysWindowsWin32MediaAudioWaveInAddBuffer(void* hwi, void* pwh, uint32_t cbwh);
uint32_t windowssysWindowsWin32MediaAudioWaveInClose(void* hwi);
uint32_t windowssysWindowsWin32MediaAudioWaveInGetDevCapsA(uint64_t udeviceid, void* pwic, uint32_t cbwic);
uint32_t windowssysWindowsWin32MediaAudioWaveInGetDevCapsW(uint64_t udeviceid, void* pwic, uint32_t cbwic);
uint32_t windowssysWindowsWin32MediaAudioWaveInGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssysWindowsWin32MediaAudioWaveInGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssysWindowsWin32MediaAudioWaveInGetID(void* hwi, void* pudeviceid);
uint32_t windowssysWindowsWin32MediaAudioWaveInGetNumDevs(void);
uint32_t windowssysWindowsWin32MediaAudioWaveInGetPosition(void* hwi, void* pmmt, uint32_t cbmmt);
uint32_t windowssysWindowsWin32MediaAudioWaveInMessage(void* hwi, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssysWindowsWin32MediaAudioWaveInOpen(void* phwi, uint32_t udeviceid, void* pwfx, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssysWindowsWin32MediaAudioWaveInPrepareHeader(void* hwi, void* pwh, uint32_t cbwh);
uint32_t windowssysWindowsWin32MediaAudioWaveInReset(void* hwi);
uint32_t windowssysWindowsWin32MediaAudioWaveInStart(void* hwi);
uint32_t windowssysWindowsWin32MediaAudioWaveInStop(void* hwi);
uint32_t windowssysWindowsWin32MediaAudioWaveInUnprepareHeader(void* hwi, void* pwh, uint32_t cbwh);
uint32_t windowssysWindowsWin32MediaAudioWaveOutBreakLoop(void* hwo);
uint32_t windowssysWindowsWin32MediaAudioWaveOutClose(void* hwo);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetDevCapsA(uint64_t udeviceid, void* pwoc, uint32_t cbwoc);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetDevCapsW(uint64_t udeviceid, void* pwoc, uint32_t cbwoc);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetID(void* hwo, void* pudeviceid);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetNumDevs(void);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetPitch(void* hwo, void* pdwpitch);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate(void* hwo, void* pdwrate);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetPosition(void* hwo, void* pmmt, uint32_t cbmmt);
uint32_t windowssysWindowsWin32MediaAudioWaveOutGetVolume(void* hwo, void* pdwvolume);
uint32_t windowssysWindowsWin32MediaAudioWaveOutMessage(void* hwo, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssysWindowsWin32MediaAudioWaveOutOpen(void* phwo, uint32_t udeviceid, void* pwfx, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssysWindowsWin32MediaAudioWaveOutPause(void* hwo);
uint32_t windowssysWindowsWin32MediaAudioWaveOutPrepareHeader(void* hwo, void* pwh, uint32_t cbwh);
uint32_t windowssysWindowsWin32MediaAudioWaveOutReset(void* hwo);
uint32_t windowssysWindowsWin32MediaAudioWaveOutRestart(void* hwo);
uint32_t windowssysWindowsWin32MediaAudioWaveOutSetPitch(void* hwo, uint32_t dwpitch);
uint32_t windowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate(void* hwo, uint32_t dwrate);
uint32_t windowssysWindowsWin32MediaAudioWaveOutSetVolume(void* hwo, uint32_t dwvolume);
uint32_t windowssysWindowsWin32MediaAudioWaveOutUnprepareHeader(void* hwo, void* pwh, uint32_t cbwh);
uint32_t windowssysWindowsWin32MediaAudioWaveOutWrite(void* hwo, void* pwh, uint32_t cbwh);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_MEDIA_AUDIO_WINDOWS_WIN32_MEDIA_AUDIO_WRAPPER_H */
