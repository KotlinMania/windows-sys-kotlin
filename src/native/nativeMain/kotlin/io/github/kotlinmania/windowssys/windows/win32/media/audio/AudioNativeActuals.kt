@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverAddA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverAddW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverEnum
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverPriority
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmDriverRemove
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterChooseA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterChooseW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterEnumA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterEnumW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterTagDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterTagDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterTagEnumA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFilterTagEnumW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatChooseA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatChooseW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatEnumA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatEnumW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatSuggest
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatTagDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatTagDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatTagEnumA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmFormatTagEnumW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmGetVersion
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmMetrics
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamConvert
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamSize
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_acmStreamUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_activateAudioInterfaceAsync
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxGetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxOutMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_auxSetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_coRegisterMessageFilter
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitor
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategory
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceId
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceRole
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_createRenderAudioStateMonitor
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategory
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceId
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceRole
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiConnect
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiDisconnect
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInAddBuffer
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetErrorTextA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetErrorTextW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInStart
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInStop
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiInUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutCacheDrumPatches
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutCachePatches
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetErrorTextA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetErrorTextW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutGetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutLongMsg
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutSetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutShortMsg
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiOutUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamOut
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamPause
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamPosition
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamProperty
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamRestart
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_midiStreamStop
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetControlDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetControlDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetLineControlsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetLineControlsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetLineInfoA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetLineInfoW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_mixerSetControlDetails
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_playSoundA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_playSoundW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_sndPlaySoundA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_sndPlaySoundW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInAddBuffer
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetErrorTextA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetErrorTextW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInGetPosition
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInStart
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInStop
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveInUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutBreakLoop
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetErrorTextA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetErrorTextW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetPitch
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetPlaybackRate
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetPosition
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutGetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutPause
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutRestart
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutSetPitch
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutSetPlaybackRate
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutSetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssys_windows_win32_media_audio_waveOutWrite
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: COpaquePointer?, activationparams: COpaquePointer?, completionhandler: COpaquePointer?, activationoperation: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_activateAudioInterfaceAsync(deviceinterfacepath?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), activationparams?.value?.toCPointer<ByteVar>(), completionhandler?.value?.toCPointer<ByteVar>(), activationoperation?.value?.toCPointer<ByteVar>())

public actual fun coRegisterMessageFilter(lpmessagefilter: COpaquePointer?, lplpmessagefilter: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_coRegisterMessageFilter(lpmessagefilter?.value?.toCPointer<ByteVar>(), lplpmessagefilter?.value?.toCPointer<ByteVar>())

public actual fun createCaptureAudioStateMonitor(audiostatemonitor: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_createCaptureAudioStateMonitor(audiostatemonitor?.value?.toCPointer<ByteVar>())

public actual fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategory(category, audiostatemonitor?.value?.toCPointer<ByteVar>())

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceId(category, deviceid?.value?.toCPointer<ByteVar>(), audiostatemonitor?.value?.toCPointer<ByteVar>())

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor?.value?.toCPointer<ByteVar>())

public actual fun createRenderAudioStateMonitor(audiostatemonitor: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_createRenderAudioStateMonitor(audiostatemonitor?.value?.toCPointer<ByteVar>())

public actual fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategory(category, audiostatemonitor?.value?.toCPointer<ByteVar>())

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceId(category, deviceid?.value?.toCPointer<ByteVar>(), audiostatemonitor?.value?.toCPointer<ByteVar>())

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor?.value?.toCPointer<ByteVar>())

public actual fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    windowssys_windows_win32_media_audio_playSoundA(pszsound?.value?.toCPointer<ByteVar>(), hmod?.value?.toCPointer<ByteVar>(), fdwsound)

public actual fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    windowssys_windows_win32_media_audio_playSoundW(pszsound?.value?.toCPointer<ByteVar>(), hmod?.value?.toCPointer<ByteVar>(), fdwsound)

public actual fun acmDriverAddA(phadid: COpaquePointer?, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverAddA(phadid?.value?.toCPointer<ByteVar>(), hinstmodule?.value?.toCPointer<ByteVar>(), lparam, dwpriority, fdwadd)

public actual fun acmDriverAddW(phadid: COpaquePointer?, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverAddW(phadid?.value?.toCPointer<ByteVar>(), hinstmodule?.value?.toCPointer<ByteVar>(), lparam, dwpriority, fdwadd)

public actual fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverClose(had?.value?.toCPointer<ByteVar>(), fdwclose)

public actual fun acmDriverDetailsA(hadid: Hacmdriverid, padd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverDetailsA(hadid?.value?.toCPointer<ByteVar>(), padd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmDriverDetailsW(hadid: Hacmdriverid, padd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverDetailsW(hadid?.value?.toCPointer<ByteVar>(), padd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverEnum(0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmDriverID(hao: Hacmobj, phadid: COpaquePointer?, fdwdriverid: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverID(hao?.value?.toCPointer<ByteVar>(), phadid?.value?.toCPointer<ByteVar>(), fdwdriverid)

public actual fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    windowssys_windows_win32_media_audio_acmDriverMessage(had?.value?.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun acmDriverOpen(phad: COpaquePointer?, hadid: Hacmdriverid, fdwopen: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverOpen(phad?.value?.toCPointer<ByteVar>(), hadid?.value?.toCPointer<ByteVar>(), fdwopen)

public actual fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverPriority(hadid?.value?.toCPointer<ByteVar>(), dwpriority, fdwpriority)

public actual fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt =
    windowssys_windows_win32_media_audio_acmDriverRemove(hadid?.value?.toCPointer<ByteVar>(), fdwremove)

public actual fun acmFilterChooseA(pafltrc: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_acmFilterChooseA(pafltrc?.value?.toCPointer<ByteVar>())

public actual fun acmFilterChooseW(pafltrc: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_acmFilterChooseW(pafltrc?.value?.toCPointer<ByteVar>())

public actual fun acmFilterDetailsA(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFilterDetailsA(had?.value?.toCPointer<ByteVar>(), pafd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterDetailsW(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFilterDetailsW(had?.value?.toCPointer<ByteVar>(), pafd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterEnumA(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFilterEnumA(had?.value?.toCPointer<ByteVar>(), pafd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFilterEnumW(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFilterEnumW(had?.value?.toCPointer<ByteVar>(), pafd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFilterTagDetailsA(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFilterTagDetailsA(had?.value?.toCPointer<ByteVar>(), paftd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterTagDetailsW(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFilterTagDetailsW(had?.value?.toCPointer<ByteVar>(), paftd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterTagEnumA(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFilterTagEnumA(had?.value?.toCPointer<ByteVar>(), paftd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFilterTagEnumW(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFilterTagEnumW(had?.value?.toCPointer<ByteVar>(), paftd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatChooseA(pafmtc: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_acmFormatChooseA(pafmtc?.value?.toCPointer<ByteVar>())

public actual fun acmFormatChooseW(pafmtc: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_acmFormatChooseW(pafmtc?.value?.toCPointer<ByteVar>())

public actual fun acmFormatDetailsA(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFormatDetailsA(had?.value?.toCPointer<ByteVar>(), pafd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatDetailsW(had: Hacmdriver, pafd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFormatDetailsW(had?.value?.toCPointer<ByteVar>(), pafd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatEnumA(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFormatEnumA(had?.value?.toCPointer<ByteVar>(), pafd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatEnumW(had: Hacmdriver, pafd: COpaquePointer?, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFormatEnumW(had?.value?.toCPointer<ByteVar>(), pafd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: COpaquePointer?, pwfxdst: COpaquePointer?, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFormatSuggest(had?.value?.toCPointer<ByteVar>(), pwfxsrc?.value?.toCPointer<ByteVar>(), pwfxdst?.value?.toCPointer<ByteVar>(), cbwfxdst, fdwsuggest)

public actual fun acmFormatTagDetailsA(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFormatTagDetailsA(had?.value?.toCPointer<ByteVar>(), paftd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatTagDetailsW(had: Hacmdriver, paftd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFormatTagDetailsW(had?.value?.toCPointer<ByteVar>(), paftd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatTagEnumA(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFormatTagEnumA(had?.value?.toCPointer<ByteVar>(), paftd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatTagEnumW(had: Hacmdriver, paftd: COpaquePointer?, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssys_windows_win32_media_audio_acmFormatTagEnumW(had?.value?.toCPointer<ByteVar>(), paftd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmGetVersion(): UInt =
    windowssys_windows_win32_media_audio_acmGetVersion()

public actual fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_acmMetrics(hao?.value?.toCPointer<ByteVar>(), umetric, pmetric?.value?.toCPointer<ByteVar>())

public actual fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt =
    windowssys_windows_win32_media_audio_acmStreamClose(has?.value?.toCPointer<ByteVar>(), fdwclose)

public actual fun acmStreamConvert(has: Hacmstream, pash: COpaquePointer?, fdwconvert: UInt): UInt =
    windowssys_windows_win32_media_audio_acmStreamConvert(has?.value?.toCPointer<ByteVar>(), pash?.value?.toCPointer<ByteVar>(), fdwconvert)

public actual fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt =
    windowssys_windows_win32_media_audio_acmStreamMessage(has?.value?.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun acmStreamOpen(phas: COpaquePointer?, had: Hacmdriver, pwfxsrc: COpaquePointer?, pwfxdst: COpaquePointer?, pwfltr: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    windowssys_windows_win32_media_audio_acmStreamOpen(phas?.value?.toCPointer<ByteVar>(), had?.value?.toCPointer<ByteVar>(), pwfxsrc?.value?.toCPointer<ByteVar>(), pwfxdst?.value?.toCPointer<ByteVar>(), pwfltr?.value?.toCPointer<ByteVar>(), dwcallback, dwinstance, fdwopen)

public actual fun acmStreamPrepareHeader(has: Hacmstream, pash: COpaquePointer?, fdwprepare: UInt): UInt =
    windowssys_windows_win32_media_audio_acmStreamPrepareHeader(has?.value?.toCPointer<ByteVar>(), pash?.value?.toCPointer<ByteVar>(), fdwprepare)

public actual fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt =
    windowssys_windows_win32_media_audio_acmStreamReset(has?.value?.toCPointer<ByteVar>(), fdwreset)

public actual fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: COpaquePointer?, fdwsize: UInt): UInt =
    windowssys_windows_win32_media_audio_acmStreamSize(has?.value?.toCPointer<ByteVar>(), cbinput, pdwoutputbytes?.value?.toCPointer<ByteVar>(), fdwsize)

public actual fun acmStreamUnprepareHeader(has: Hacmstream, pash: COpaquePointer?, fdwunprepare: UInt): UInt =
    windowssys_windows_win32_media_audio_acmStreamUnprepareHeader(has?.value?.toCPointer<ByteVar>(), pash?.value?.toCPointer<ByteVar>(), fdwunprepare)

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: COpaquePointer?, cbac: UInt): UInt =
    windowssys_windows_win32_media_audio_auxGetDevCapsA(udeviceid, pac?.value?.toCPointer<ByteVar>(), cbac)

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: COpaquePointer?, cbac: UInt): UInt =
    windowssys_windows_win32_media_audio_auxGetDevCapsW(udeviceid, pac?.value?.toCPointer<ByteVar>(), cbac)

public actual fun auxGetNumDevs(): UInt =
    windowssys_windows_win32_media_audio_auxGetNumDevs()

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_auxGetVolume(udeviceid, pdwvolume?.value?.toCPointer<ByteVar>())

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssys_windows_win32_media_audio_auxOutMessage(udeviceid, umsg, dw1, dw2)

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    windowssys_windows_win32_media_audio_auxSetVolume(udeviceid, dwvolume)

public actual fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_midiConnect(hmi?.value?.toCPointer<ByteVar>(), hmo?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_midiDisconnect(hmi?.value?.toCPointer<ByteVar>(), hmo?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun midiInAddBuffer(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    windowssys_windows_win32_media_audio_midiInAddBuffer(hmi?.value?.toCPointer<ByteVar>(), pmh?.value?.toCPointer<ByteVar>(), cbmh)

public actual fun midiInClose(hmi: Hmidiin): UInt =
    windowssys_windows_win32_media_audio_midiInClose(hmi?.value?.toCPointer<ByteVar>())

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: COpaquePointer?, cbmic: UInt): UInt =
    windowssys_windows_win32_media_audio_midiInGetDevCapsA(udeviceid, pmic?.value?.toCPointer<ByteVar>(), cbmic)

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: COpaquePointer?, cbmic: UInt): UInt =
    windowssys_windows_win32_media_audio_midiInGetDevCapsW(udeviceid, pmic?.value?.toCPointer<ByteVar>(), cbmic)

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    windowssys_windows_win32_media_audio_midiInGetErrorTextA(mmrerror, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    windowssys_windows_win32_media_audio_midiInGetErrorTextW(mmrerror, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun midiInGetID(hmi: Hmidiin, pudeviceid: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_midiInGetID(hmi?.value?.toCPointer<ByteVar>(), pudeviceid?.value?.toCPointer<ByteVar>())

public actual fun midiInGetNumDevs(): UInt =
    windowssys_windows_win32_media_audio_midiInGetNumDevs()

public actual fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssys_windows_win32_media_audio_midiInMessage(hmi?.value?.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun midiInOpen(phmi: COpaquePointer?, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    windowssys_windows_win32_media_audio_midiInOpen(phmi?.value?.toCPointer<ByteVar>(), udeviceid, dwcallback, dwinstance, fdwopen)

public actual fun midiInPrepareHeader(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    windowssys_windows_win32_media_audio_midiInPrepareHeader(hmi?.value?.toCPointer<ByteVar>(), pmh?.value?.toCPointer<ByteVar>(), cbmh)

public actual fun midiInReset(hmi: Hmidiin): UInt =
    windowssys_windows_win32_media_audio_midiInReset(hmi?.value?.toCPointer<ByteVar>())

public actual fun midiInStart(hmi: Hmidiin): UInt =
    windowssys_windows_win32_media_audio_midiInStart(hmi?.value?.toCPointer<ByteVar>())

public actual fun midiInStop(hmi: Hmidiin): UInt =
    windowssys_windows_win32_media_audio_midiInStop(hmi?.value?.toCPointer<ByteVar>())

public actual fun midiInUnprepareHeader(hmi: Hmidiin, pmh: COpaquePointer?, cbmh: UInt): UInt =
    windowssys_windows_win32_media_audio_midiInUnprepareHeader(hmi?.value?.toCPointer<ByteVar>(), pmh?.value?.toCPointer<ByteVar>(), cbmh)

public actual fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: COpaquePointer?, fucache: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutCacheDrumPatches(hmo?.value?.toCPointer<ByteVar>(), upatch, pwkya?.value?.toCPointer<ByteVar>(), fucache)

public actual fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: COpaquePointer?, fucache: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutCachePatches(hmo?.value?.toCPointer<ByteVar>(), ubank, pwpa?.value?.toCPointer<ByteVar>(), fucache)

public actual fun midiOutClose(hmo: Hmidiout): UInt =
    windowssys_windows_win32_media_audio_midiOutClose(hmo?.value?.toCPointer<ByteVar>())

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: COpaquePointer?, cbmoc: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutGetDevCapsA(udeviceid, pmoc?.value?.toCPointer<ByteVar>(), cbmoc)

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: COpaquePointer?, cbmoc: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutGetDevCapsW(udeviceid, pmoc?.value?.toCPointer<ByteVar>(), cbmoc)

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutGetErrorTextA(mmrerror, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutGetErrorTextW(mmrerror, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun midiOutGetID(hmo: Hmidiout, pudeviceid: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_midiOutGetID(hmo?.value?.toCPointer<ByteVar>(), pudeviceid?.value?.toCPointer<ByteVar>())

public actual fun midiOutGetNumDevs(): UInt =
    windowssys_windows_win32_media_audio_midiOutGetNumDevs()

public actual fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_midiOutGetVolume(hmo?.value?.toCPointer<ByteVar>(), pdwvolume?.value?.toCPointer<ByteVar>())

public actual fun midiOutLongMsg(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutLongMsg(hmo?.value?.toCPointer<ByteVar>(), pmh?.value?.toCPointer<ByteVar>(), cbmh)

public actual fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssys_windows_win32_media_audio_midiOutMessage(hmo?.value?.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun midiOutOpen(phmo: COpaquePointer?, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    windowssys_windows_win32_media_audio_midiOutOpen(phmo?.value?.toCPointer<ByteVar>(), udeviceid, dwcallback, dwinstance, fdwopen)

public actual fun midiOutPrepareHeader(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutPrepareHeader(hmo?.value?.toCPointer<ByteVar>(), pmh?.value?.toCPointer<ByteVar>(), cbmh)

public actual fun midiOutReset(hmo: Hmidiout): UInt =
    windowssys_windows_win32_media_audio_midiOutReset(hmo?.value?.toCPointer<ByteVar>())

public actual fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutSetVolume(hmo?.value?.toCPointer<ByteVar>(), dwvolume)

public actual fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutShortMsg(hmo?.value?.toCPointer<ByteVar>(), dwmsg)

public actual fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: COpaquePointer?, cbmh: UInt): UInt =
    windowssys_windows_win32_media_audio_midiOutUnprepareHeader(hmo?.value?.toCPointer<ByteVar>(), pmh?.value?.toCPointer<ByteVar>(), cbmh)

public actual fun midiStreamClose(hms: Hmidistrm): UInt =
    windowssys_windows_win32_media_audio_midiStreamClose(hms?.value?.toCPointer<ByteVar>())

public actual fun midiStreamOpen(phms: COpaquePointer?, pudeviceid: COpaquePointer?, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    windowssys_windows_win32_media_audio_midiStreamOpen(phms?.value?.toCPointer<ByteVar>(), pudeviceid?.value?.toCPointer<ByteVar>(), cmidi, dwcallback, dwinstance, fdwopen)

public actual fun midiStreamOut(hms: Hmidistrm, pmh: COpaquePointer?, cbmh: UInt): UInt =
    windowssys_windows_win32_media_audio_midiStreamOut(hms?.value?.toCPointer<ByteVar>(), pmh?.value?.toCPointer<ByteVar>(), cbmh)

public actual fun midiStreamPause(hms: Hmidistrm): UInt =
    windowssys_windows_win32_media_audio_midiStreamPause(hms?.value?.toCPointer<ByteVar>())

public actual fun midiStreamPosition(hms: Hmidistrm, lpmmt: COpaquePointer?, cbmmt: UInt): UInt =
    windowssys_windows_win32_media_audio_midiStreamPosition(hms?.value?.toCPointer<ByteVar>(), lpmmt?.value?.toCPointer<ByteVar>(), cbmmt)

public actual fun midiStreamProperty(hms: Hmidistrm, lppropdata: COpaquePointer?, dwproperty: UInt): UInt =
    windowssys_windows_win32_media_audio_midiStreamProperty(hms?.value?.toCPointer<ByteVar>(), lppropdata?.value?.toCPointer<ByteVar>(), dwproperty)

public actual fun midiStreamRestart(hms: Hmidistrm): UInt =
    windowssys_windows_win32_media_audio_midiStreamRestart(hms?.value?.toCPointer<ByteVar>())

public actual fun midiStreamStop(hms: Hmidistrm): UInt =
    windowssys_windows_win32_media_audio_midiStreamStop(hms?.value?.toCPointer<ByteVar>())

public actual fun mixerClose(hmx: Hmixer): UInt =
    windowssys_windows_win32_media_audio_mixerClose(hmx?.value?.toCPointer<ByteVar>())

public actual fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerGetControlDetailsA(hmxobj?.value?.toCPointer<ByteVar>(), pmxcd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerGetControlDetailsW(hmxobj?.value?.toCPointer<ByteVar>(), pmxcd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: COpaquePointer?, cbmxcaps: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerGetDevCapsA(umxid, pmxcaps?.value?.toCPointer<ByteVar>(), cbmxcaps)

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: COpaquePointer?, cbmxcaps: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerGetDevCapsW(umxid, pmxcaps?.value?.toCPointer<ByteVar>(), cbmxcaps)

public actual fun mixerGetID(hmxobj: Hmixerobj, pumxid: COpaquePointer?, fdwid: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerGetID(hmxobj?.value?.toCPointer<ByteVar>(), pumxid?.value?.toCPointer<ByteVar>(), fdwid)

public actual fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: COpaquePointer?, fdwcontrols: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerGetLineControlsA(hmxobj?.value?.toCPointer<ByteVar>(), pmxlc?.value?.toCPointer<ByteVar>(), fdwcontrols)

public actual fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: COpaquePointer?, fdwcontrols: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerGetLineControlsW(hmxobj?.value?.toCPointer<ByteVar>(), pmxlc?.value?.toCPointer<ByteVar>(), fdwcontrols)

public actual fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: COpaquePointer?, fdwinfo: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerGetLineInfoA(hmxobj?.value?.toCPointer<ByteVar>(), pmxl?.value?.toCPointer<ByteVar>(), fdwinfo)

public actual fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: COpaquePointer?, fdwinfo: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerGetLineInfoW(hmxobj?.value?.toCPointer<ByteVar>(), pmxl?.value?.toCPointer<ByteVar>(), fdwinfo)

public actual fun mixerGetNumDevs(): UInt =
    windowssys_windows_win32_media_audio_mixerGetNumDevs()

public actual fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    windowssys_windows_win32_media_audio_mixerMessage(hmx?.value?.toCPointer<ByteVar>(), umsg, dwparam1, dwparam2)

public actual fun mixerOpen(phmx: COpaquePointer?, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerOpen(phmx?.value?.toCPointer<ByteVar>(), umxid, dwcallback, dwinstance, fdwopen)

public actual fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: COpaquePointer?, fdwdetails: UInt): UInt =
    windowssys_windows_win32_media_audio_mixerSetControlDetails(hmxobj?.value?.toCPointer<ByteVar>(), pmxcd?.value?.toCPointer<ByteVar>(), fdwdetails)

public actual fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool =
    windowssys_windows_win32_media_audio_sndPlaySoundA(pszsound?.value?.toCPointer<ByteVar>(), fusound)

public actual fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool =
    windowssys_windows_win32_media_audio_sndPlaySoundW(pszsound?.value?.toCPointer<ByteVar>(), fusound)

public actual fun waveInAddBuffer(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    windowssys_windows_win32_media_audio_waveInAddBuffer(hwi?.value?.toCPointer<ByteVar>(), pwh?.value?.toCPointer<ByteVar>(), cbwh)

public actual fun waveInClose(hwi: Hwavein): UInt =
    windowssys_windows_win32_media_audio_waveInClose(hwi?.value?.toCPointer<ByteVar>())

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: COpaquePointer?, cbwic: UInt): UInt =
    windowssys_windows_win32_media_audio_waveInGetDevCapsA(udeviceid, pwic?.value?.toCPointer<ByteVar>(), cbwic)

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: COpaquePointer?, cbwic: UInt): UInt =
    windowssys_windows_win32_media_audio_waveInGetDevCapsW(udeviceid, pwic?.value?.toCPointer<ByteVar>(), cbwic)

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    windowssys_windows_win32_media_audio_waveInGetErrorTextA(mmrerror, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    windowssys_windows_win32_media_audio_waveInGetErrorTextW(mmrerror, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun waveInGetID(hwi: Hwavein, pudeviceid: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_waveInGetID(hwi?.value?.toCPointer<ByteVar>(), pudeviceid?.value?.toCPointer<ByteVar>())

public actual fun waveInGetNumDevs(): UInt =
    windowssys_windows_win32_media_audio_waveInGetNumDevs()

public actual fun waveInGetPosition(hwi: Hwavein, pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    windowssys_windows_win32_media_audio_waveInGetPosition(hwi?.value?.toCPointer<ByteVar>(), pmmt?.value?.toCPointer<ByteVar>(), cbmmt)

public actual fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssys_windows_win32_media_audio_waveInMessage(hwi?.value?.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun waveInOpen(phwi: COpaquePointer?, udeviceid: UInt, pwfx: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    windowssys_windows_win32_media_audio_waveInOpen(phwi?.value?.toCPointer<ByteVar>(), udeviceid, pwfx?.value?.toCPointer<ByteVar>(), dwcallback, dwinstance, fdwopen)

public actual fun waveInPrepareHeader(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    windowssys_windows_win32_media_audio_waveInPrepareHeader(hwi?.value?.toCPointer<ByteVar>(), pwh?.value?.toCPointer<ByteVar>(), cbwh)

public actual fun waveInReset(hwi: Hwavein): UInt =
    windowssys_windows_win32_media_audio_waveInReset(hwi?.value?.toCPointer<ByteVar>())

public actual fun waveInStart(hwi: Hwavein): UInt =
    windowssys_windows_win32_media_audio_waveInStart(hwi?.value?.toCPointer<ByteVar>())

public actual fun waveInStop(hwi: Hwavein): UInt =
    windowssys_windows_win32_media_audio_waveInStop(hwi?.value?.toCPointer<ByteVar>())

public actual fun waveInUnprepareHeader(hwi: Hwavein, pwh: COpaquePointer?, cbwh: UInt): UInt =
    windowssys_windows_win32_media_audio_waveInUnprepareHeader(hwi?.value?.toCPointer<ByteVar>(), pwh?.value?.toCPointer<ByteVar>(), cbwh)

public actual fun waveOutBreakLoop(hwo: Hwaveout): UInt =
    windowssys_windows_win32_media_audio_waveOutBreakLoop(hwo?.value?.toCPointer<ByteVar>())

public actual fun waveOutClose(hwo: Hwaveout): UInt =
    windowssys_windows_win32_media_audio_waveOutClose(hwo?.value?.toCPointer<ByteVar>())

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: COpaquePointer?, cbwoc: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutGetDevCapsA(udeviceid, pwoc?.value?.toCPointer<ByteVar>(), cbwoc)

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: COpaquePointer?, cbwoc: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutGetDevCapsW(udeviceid, pwoc?.value?.toCPointer<ByteVar>(), cbwoc)

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutGetErrorTextA(mmrerror, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutGetErrorTextW(mmrerror, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun waveOutGetID(hwo: Hwaveout, pudeviceid: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_waveOutGetID(hwo?.value?.toCPointer<ByteVar>(), pudeviceid?.value?.toCPointer<ByteVar>())

public actual fun waveOutGetNumDevs(): UInt =
    windowssys_windows_win32_media_audio_waveOutGetNumDevs()

public actual fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_waveOutGetPitch(hwo?.value?.toCPointer<ByteVar>(), pdwpitch?.value?.toCPointer<ByteVar>())

public actual fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_waveOutGetPlaybackRate(hwo?.value?.toCPointer<ByteVar>(), pdwrate?.value?.toCPointer<ByteVar>())

public actual fun waveOutGetPosition(hwo: Hwaveout, pmmt: COpaquePointer?, cbmmt: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutGetPosition(hwo?.value?.toCPointer<ByteVar>(), pmmt?.value?.toCPointer<ByteVar>(), cbmmt)

public actual fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: COpaquePointer?): UInt =
    windowssys_windows_win32_media_audio_waveOutGetVolume(hwo?.value?.toCPointer<ByteVar>(), pdwvolume?.value?.toCPointer<ByteVar>())

public actual fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssys_windows_win32_media_audio_waveOutMessage(hwo?.value?.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun waveOutOpen(phwo: COpaquePointer?, udeviceid: UInt, pwfx: COpaquePointer?, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    windowssys_windows_win32_media_audio_waveOutOpen(phwo?.value?.toCPointer<ByteVar>(), udeviceid, pwfx?.value?.toCPointer<ByteVar>(), dwcallback, dwinstance, fdwopen)

public actual fun waveOutPause(hwo: Hwaveout): UInt =
    windowssys_windows_win32_media_audio_waveOutPause(hwo?.value?.toCPointer<ByteVar>())

public actual fun waveOutPrepareHeader(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutPrepareHeader(hwo?.value?.toCPointer<ByteVar>(), pwh?.value?.toCPointer<ByteVar>(), cbwh)

public actual fun waveOutReset(hwo: Hwaveout): UInt =
    windowssys_windows_win32_media_audio_waveOutReset(hwo?.value?.toCPointer<ByteVar>())

public actual fun waveOutRestart(hwo: Hwaveout): UInt =
    windowssys_windows_win32_media_audio_waveOutRestart(hwo?.value?.toCPointer<ByteVar>())

public actual fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutSetPitch(hwo?.value?.toCPointer<ByteVar>(), dwpitch)

public actual fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutSetPlaybackRate(hwo?.value?.toCPointer<ByteVar>(), dwrate)

public actual fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutSetVolume(hwo?.value?.toCPointer<ByteVar>(), dwvolume)

public actual fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutUnprepareHeader(hwo?.value?.toCPointer<ByteVar>(), pwh?.value?.toCPointer<ByteVar>(), cbwh)

public actual fun waveOutWrite(hwo: Hwaveout, pwh: COpaquePointer?, cbwh: UInt): UInt =
    windowssys_windows_win32_media_audio_waveOutWrite(hwo?.value?.toCPointer<ByteVar>(), pwh?.value?.toCPointer<ByteVar>(), cbwh)
