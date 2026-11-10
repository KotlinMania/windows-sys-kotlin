#ifndef WINDOWSSYS_WINDOWS_WIN32_MEDIA_AUDIO_WINDOWS_WIN32_MEDIA_AUDIO_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_MEDIA_AUDIO_WINDOWS_WIN32_MEDIA_AUDIO_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_media_audio_activateAudioInterfaceAsync(void* deviceinterfacepath, void* riid, void* activationparams, void* completionhandler, void* activationoperation);
int32_t windowssys_windows_win32_media_audio_coRegisterMessageFilter(void* lpmessagefilter, void* lplpmessagefilter);
int32_t windowssys_windows_win32_media_audio_createCaptureAudioStateMonitor(void* audiostatemonitor);
int32_t windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategory(int32_t category, void* audiostatemonitor);
int32_t windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceId(int32_t category, void* deviceid, void* audiostatemonitor);
int32_t windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceRole(int32_t category, int32_t role, void* audiostatemonitor);
int32_t windowssys_windows_win32_media_audio_createRenderAudioStateMonitor(void* audiostatemonitor);
int32_t windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategory(int32_t category, void* audiostatemonitor);
int32_t windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceId(int32_t category, void* deviceid, void* audiostatemonitor);
int32_t windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceRole(int32_t category, int32_t role, void* audiostatemonitor);
int32_t windowssys_windows_win32_media_audio_playSoundA(void* pszsound, void* hmod, uint32_t fdwsound);
int32_t windowssys_windows_win32_media_audio_playSoundW(void* pszsound, void* hmod, uint32_t fdwsound);
uint32_t windowssys_windows_win32_media_audio_acmDriverAddA(void* phadid, void* hinstmodule, int64_t lparam, uint32_t dwpriority, uint32_t fdwadd);
uint32_t windowssys_windows_win32_media_audio_acmDriverAddW(void* phadid, void* hinstmodule, int64_t lparam, uint32_t dwpriority, uint32_t fdwadd);
uint32_t windowssys_windows_win32_media_audio_acmDriverClose(void* had, uint32_t fdwclose);
uint32_t windowssys_windows_win32_media_audio_acmDriverDetailsA(void* hadid, void* padd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmDriverDetailsW(void* hadid, void* padd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmDriverEnum(void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssys_windows_win32_media_audio_acmDriverID(void* hao, void* phadid, uint32_t fdwdriverid);
int64_t windowssys_windows_win32_media_audio_acmDriverMessage(void* had, uint32_t umsg, int64_t lparam1, int64_t lparam2);
uint32_t windowssys_windows_win32_media_audio_acmDriverOpen(void* phad, void* hadid, uint32_t fdwopen);
uint32_t windowssys_windows_win32_media_audio_acmDriverPriority(void* hadid, uint32_t dwpriority, uint32_t fdwpriority);
uint32_t windowssys_windows_win32_media_audio_acmDriverRemove(void* hadid, uint32_t fdwremove);
uint32_t windowssys_windows_win32_media_audio_acmFilterChooseA(void* pafltrc);
uint32_t windowssys_windows_win32_media_audio_acmFilterChooseW(void* pafltrc);
uint32_t windowssys_windows_win32_media_audio_acmFilterDetailsA(void* had, void* pafd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmFilterDetailsW(void* had, void* pafd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmFilterEnumA(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssys_windows_win32_media_audio_acmFilterEnumW(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssys_windows_win32_media_audio_acmFilterTagDetailsA(void* had, void* paftd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmFilterTagDetailsW(void* had, void* paftd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmFilterTagEnumA(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssys_windows_win32_media_audio_acmFilterTagEnumW(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssys_windows_win32_media_audio_acmFormatChooseA(void* pafmtc);
uint32_t windowssys_windows_win32_media_audio_acmFormatChooseW(void* pafmtc);
uint32_t windowssys_windows_win32_media_audio_acmFormatDetailsA(void* had, void* pafd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmFormatDetailsW(void* had, void* pafd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmFormatEnumA(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssys_windows_win32_media_audio_acmFormatEnumW(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssys_windows_win32_media_audio_acmFormatSuggest(void* had, void* pwfxsrc, void* pwfxdst, uint32_t cbwfxdst, uint32_t fdwsuggest);
uint32_t windowssys_windows_win32_media_audio_acmFormatTagDetailsA(void* had, void* paftd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmFormatTagDetailsW(void* had, void* paftd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_acmFormatTagEnumA(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssys_windows_win32_media_audio_acmFormatTagEnumW(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum);
uint32_t windowssys_windows_win32_media_audio_acmGetVersion(void);
uint32_t windowssys_windows_win32_media_audio_acmMetrics(void* hao, uint32_t umetric, void* pmetric);
uint32_t windowssys_windows_win32_media_audio_acmStreamClose(void* has, uint32_t fdwclose);
uint32_t windowssys_windows_win32_media_audio_acmStreamConvert(void* has, void* pash, uint32_t fdwconvert);
uint32_t windowssys_windows_win32_media_audio_acmStreamMessage(void* has, uint32_t umsg, int64_t lparam1, int64_t lparam2);
uint32_t windowssys_windows_win32_media_audio_acmStreamOpen(void* phas, void* had, void* pwfxsrc, void* pwfxdst, void* pwfltr, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssys_windows_win32_media_audio_acmStreamPrepareHeader(void* has, void* pash, uint32_t fdwprepare);
uint32_t windowssys_windows_win32_media_audio_acmStreamReset(void* has, uint32_t fdwreset);
uint32_t windowssys_windows_win32_media_audio_acmStreamSize(void* has, uint32_t cbinput, void* pdwoutputbytes, uint32_t fdwsize);
uint32_t windowssys_windows_win32_media_audio_acmStreamUnprepareHeader(void* has, void* pash, uint32_t fdwunprepare);
uint32_t windowssys_windows_win32_media_audio_auxGetDevCapsA(uint64_t udeviceid, void* pac, uint32_t cbac);
uint32_t windowssys_windows_win32_media_audio_auxGetDevCapsW(uint64_t udeviceid, void* pac, uint32_t cbac);
uint32_t windowssys_windows_win32_media_audio_auxGetNumDevs(void);
uint32_t windowssys_windows_win32_media_audio_auxGetVolume(uint32_t udeviceid, void* pdwvolume);
uint32_t windowssys_windows_win32_media_audio_auxOutMessage(uint32_t udeviceid, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssys_windows_win32_media_audio_auxSetVolume(uint32_t udeviceid, uint32_t dwvolume);
uint32_t windowssys_windows_win32_media_audio_midiConnect(void* hmi, void* hmo, void* preserved);
uint32_t windowssys_windows_win32_media_audio_midiDisconnect(void* hmi, void* hmo, void* preserved);
uint32_t windowssys_windows_win32_media_audio_midiInAddBuffer(void* hmi, void* pmh, uint32_t cbmh);
uint32_t windowssys_windows_win32_media_audio_midiInClose(void* hmi);
uint32_t windowssys_windows_win32_media_audio_midiInGetDevCapsA(uint64_t udeviceid, void* pmic, uint32_t cbmic);
uint32_t windowssys_windows_win32_media_audio_midiInGetDevCapsW(uint64_t udeviceid, void* pmic, uint32_t cbmic);
uint32_t windowssys_windows_win32_media_audio_midiInGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssys_windows_win32_media_audio_midiInGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssys_windows_win32_media_audio_midiInGetID(void* hmi, void* pudeviceid);
uint32_t windowssys_windows_win32_media_audio_midiInGetNumDevs(void);
uint32_t windowssys_windows_win32_media_audio_midiInMessage(void* hmi, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssys_windows_win32_media_audio_midiInOpen(void* phmi, uint32_t udeviceid, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssys_windows_win32_media_audio_midiInPrepareHeader(void* hmi, void* pmh, uint32_t cbmh);
uint32_t windowssys_windows_win32_media_audio_midiInReset(void* hmi);
uint32_t windowssys_windows_win32_media_audio_midiInStart(void* hmi);
uint32_t windowssys_windows_win32_media_audio_midiInStop(void* hmi);
uint32_t windowssys_windows_win32_media_audio_midiInUnprepareHeader(void* hmi, void* pmh, uint32_t cbmh);
uint32_t windowssys_windows_win32_media_audio_midiOutCacheDrumPatches(void* hmo, uint32_t upatch, void* pwkya, uint32_t fucache);
uint32_t windowssys_windows_win32_media_audio_midiOutCachePatches(void* hmo, uint32_t ubank, void* pwpa, uint32_t fucache);
uint32_t windowssys_windows_win32_media_audio_midiOutClose(void* hmo);
uint32_t windowssys_windows_win32_media_audio_midiOutGetDevCapsA(uint64_t udeviceid, void* pmoc, uint32_t cbmoc);
uint32_t windowssys_windows_win32_media_audio_midiOutGetDevCapsW(uint64_t udeviceid, void* pmoc, uint32_t cbmoc);
uint32_t windowssys_windows_win32_media_audio_midiOutGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssys_windows_win32_media_audio_midiOutGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssys_windows_win32_media_audio_midiOutGetID(void* hmo, void* pudeviceid);
uint32_t windowssys_windows_win32_media_audio_midiOutGetNumDevs(void);
uint32_t windowssys_windows_win32_media_audio_midiOutGetVolume(void* hmo, void* pdwvolume);
uint32_t windowssys_windows_win32_media_audio_midiOutLongMsg(void* hmo, void* pmh, uint32_t cbmh);
uint32_t windowssys_windows_win32_media_audio_midiOutMessage(void* hmo, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssys_windows_win32_media_audio_midiOutOpen(void* phmo, uint32_t udeviceid, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssys_windows_win32_media_audio_midiOutPrepareHeader(void* hmo, void* pmh, uint32_t cbmh);
uint32_t windowssys_windows_win32_media_audio_midiOutReset(void* hmo);
uint32_t windowssys_windows_win32_media_audio_midiOutSetVolume(void* hmo, uint32_t dwvolume);
uint32_t windowssys_windows_win32_media_audio_midiOutShortMsg(void* hmo, uint32_t dwmsg);
uint32_t windowssys_windows_win32_media_audio_midiOutUnprepareHeader(void* hmo, void* pmh, uint32_t cbmh);
uint32_t windowssys_windows_win32_media_audio_midiStreamClose(void* hms);
uint32_t windowssys_windows_win32_media_audio_midiStreamOpen(void* phms, void* pudeviceid, uint32_t cmidi, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssys_windows_win32_media_audio_midiStreamOut(void* hms, void* pmh, uint32_t cbmh);
uint32_t windowssys_windows_win32_media_audio_midiStreamPause(void* hms);
uint32_t windowssys_windows_win32_media_audio_midiStreamPosition(void* hms, void* lpmmt, uint32_t cbmmt);
uint32_t windowssys_windows_win32_media_audio_midiStreamProperty(void* hms, void* lppropdata, uint32_t dwproperty);
uint32_t windowssys_windows_win32_media_audio_midiStreamRestart(void* hms);
uint32_t windowssys_windows_win32_media_audio_midiStreamStop(void* hms);
uint32_t windowssys_windows_win32_media_audio_mixerClose(void* hmx);
uint32_t windowssys_windows_win32_media_audio_mixerGetControlDetailsA(void* hmxobj, void* pmxcd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_mixerGetControlDetailsW(void* hmxobj, void* pmxcd, uint32_t fdwdetails);
uint32_t windowssys_windows_win32_media_audio_mixerGetDevCapsA(uint64_t umxid, void* pmxcaps, uint32_t cbmxcaps);
uint32_t windowssys_windows_win32_media_audio_mixerGetDevCapsW(uint64_t umxid, void* pmxcaps, uint32_t cbmxcaps);
uint32_t windowssys_windows_win32_media_audio_mixerGetID(void* hmxobj, void* pumxid, uint32_t fdwid);
uint32_t windowssys_windows_win32_media_audio_mixerGetLineControlsA(void* hmxobj, void* pmxlc, uint32_t fdwcontrols);
uint32_t windowssys_windows_win32_media_audio_mixerGetLineControlsW(void* hmxobj, void* pmxlc, uint32_t fdwcontrols);
uint32_t windowssys_windows_win32_media_audio_mixerGetLineInfoA(void* hmxobj, void* pmxl, uint32_t fdwinfo);
uint32_t windowssys_windows_win32_media_audio_mixerGetLineInfoW(void* hmxobj, void* pmxl, uint32_t fdwinfo);
uint32_t windowssys_windows_win32_media_audio_mixerGetNumDevs(void);
uint32_t windowssys_windows_win32_media_audio_mixerMessage(void* hmx, uint32_t umsg, uint64_t dwparam1, uint64_t dwparam2);
uint32_t windowssys_windows_win32_media_audio_mixerOpen(void* phmx, uint32_t umxid, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssys_windows_win32_media_audio_mixerSetControlDetails(void* hmxobj, void* pmxcd, uint32_t fdwdetails);
int32_t windowssys_windows_win32_media_audio_sndPlaySoundA(void* pszsound, uint32_t fusound);
int32_t windowssys_windows_win32_media_audio_sndPlaySoundW(void* pszsound, uint32_t fusound);
uint32_t windowssys_windows_win32_media_audio_waveInAddBuffer(void* hwi, void* pwh, uint32_t cbwh);
uint32_t windowssys_windows_win32_media_audio_waveInClose(void* hwi);
uint32_t windowssys_windows_win32_media_audio_waveInGetDevCapsA(uint64_t udeviceid, void* pwic, uint32_t cbwic);
uint32_t windowssys_windows_win32_media_audio_waveInGetDevCapsW(uint64_t udeviceid, void* pwic, uint32_t cbwic);
uint32_t windowssys_windows_win32_media_audio_waveInGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssys_windows_win32_media_audio_waveInGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssys_windows_win32_media_audio_waveInGetID(void* hwi, void* pudeviceid);
uint32_t windowssys_windows_win32_media_audio_waveInGetNumDevs(void);
uint32_t windowssys_windows_win32_media_audio_waveInGetPosition(void* hwi, void* pmmt, uint32_t cbmmt);
uint32_t windowssys_windows_win32_media_audio_waveInMessage(void* hwi, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssys_windows_win32_media_audio_waveInOpen(void* phwi, uint32_t udeviceid, void* pwfx, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssys_windows_win32_media_audio_waveInPrepareHeader(void* hwi, void* pwh, uint32_t cbwh);
uint32_t windowssys_windows_win32_media_audio_waveInReset(void* hwi);
uint32_t windowssys_windows_win32_media_audio_waveInStart(void* hwi);
uint32_t windowssys_windows_win32_media_audio_waveInStop(void* hwi);
uint32_t windowssys_windows_win32_media_audio_waveInUnprepareHeader(void* hwi, void* pwh, uint32_t cbwh);
uint32_t windowssys_windows_win32_media_audio_waveOutBreakLoop(void* hwo);
uint32_t windowssys_windows_win32_media_audio_waveOutClose(void* hwo);
uint32_t windowssys_windows_win32_media_audio_waveOutGetDevCapsA(uint64_t udeviceid, void* pwoc, uint32_t cbwoc);
uint32_t windowssys_windows_win32_media_audio_waveOutGetDevCapsW(uint64_t udeviceid, void* pwoc, uint32_t cbwoc);
uint32_t windowssys_windows_win32_media_audio_waveOutGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssys_windows_win32_media_audio_waveOutGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext);
uint32_t windowssys_windows_win32_media_audio_waveOutGetID(void* hwo, void* pudeviceid);
uint32_t windowssys_windows_win32_media_audio_waveOutGetNumDevs(void);
uint32_t windowssys_windows_win32_media_audio_waveOutGetPitch(void* hwo, void* pdwpitch);
uint32_t windowssys_windows_win32_media_audio_waveOutGetPlaybackRate(void* hwo, void* pdwrate);
uint32_t windowssys_windows_win32_media_audio_waveOutGetPosition(void* hwo, void* pmmt, uint32_t cbmmt);
uint32_t windowssys_windows_win32_media_audio_waveOutGetVolume(void* hwo, void* pdwvolume);
uint32_t windowssys_windows_win32_media_audio_waveOutMessage(void* hwo, uint32_t umsg, uint64_t dw1, uint64_t dw2);
uint32_t windowssys_windows_win32_media_audio_waveOutOpen(void* phwo, uint32_t udeviceid, void* pwfx, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen);
uint32_t windowssys_windows_win32_media_audio_waveOutPause(void* hwo);
uint32_t windowssys_windows_win32_media_audio_waveOutPrepareHeader(void* hwo, void* pwh, uint32_t cbwh);
uint32_t windowssys_windows_win32_media_audio_waveOutReset(void* hwo);
uint32_t windowssys_windows_win32_media_audio_waveOutRestart(void* hwo);
uint32_t windowssys_windows_win32_media_audio_waveOutSetPitch(void* hwo, uint32_t dwpitch);
uint32_t windowssys_windows_win32_media_audio_waveOutSetPlaybackRate(void* hwo, uint32_t dwrate);
uint32_t windowssys_windows_win32_media_audio_waveOutSetVolume(void* hwo, uint32_t dwvolume);
uint32_t windowssys_windows_win32_media_audio_waveOutUnprepareHeader(void* hwo, void* pwh, uint32_t cbwh);
uint32_t windowssys_windows_win32_media_audio_waveOutWrite(void* hwo, void* pwh, uint32_t cbwh);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_MEDIA_AUDIO_WINDOWS_WIN32_MEDIA_AUDIO_WRAPPER_H */
