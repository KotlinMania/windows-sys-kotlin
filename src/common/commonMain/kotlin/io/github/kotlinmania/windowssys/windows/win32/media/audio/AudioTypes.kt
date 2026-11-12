package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.Hdrvr

public fun interface AcmdriverenumcbFn {
    public operator fun invoke(hadid: Hacmdriverid, dwinstance: ULong, fdwsupport: UInt): Bool
}

public typealias Acmdriverenumcb = AcmdriverenumcbFn?

public fun interface AcmfilterchoosehookprocaFn {
    public operator fun invoke(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): UInt
}

public typealias Acmfilterchoosehookproca = AcmfilterchoosehookprocaFn?

public fun interface AcmfilterchoosehookprocwFn {
    public operator fun invoke(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): UInt
}

public typealias Acmfilterchoosehookprocw = AcmfilterchoosehookprocwFn?

public fun interface AcmfilterenumcbaFn {
    public operator fun invoke(hadid: Hacmdriverid, pafd: MutPtr<Acmfilterdetailsa>, dwinstance: ULong, fdwsupport: UInt): Bool
}

public typealias Acmfilterenumcba = AcmfilterenumcbaFn?

public fun interface AcmfilterenumcbwFn {
    public operator fun invoke(hadid: Hacmdriverid, pafd: MutPtr<Acmfilterdetailsw>, dwinstance: ULong, fdwsupport: UInt): Bool
}

public typealias Acmfilterenumcbw = AcmfilterenumcbwFn?

public fun interface AcmfiltertagenumcbaFn {
    public operator fun invoke(hadid: Hacmdriverid, paftd: MutPtr<Acmfiltertagdetailsa>, dwinstance: ULong, fdwsupport: UInt): Bool
}

public typealias Acmfiltertagenumcba = AcmfiltertagenumcbaFn?

public fun interface AcmfiltertagenumcbwFn {
    public operator fun invoke(hadid: Hacmdriverid, paftd: MutPtr<Acmfiltertagdetailsw>, dwinstance: ULong, fdwsupport: UInt): Bool
}

public typealias Acmfiltertagenumcbw = AcmfiltertagenumcbwFn?

public fun interface AcmformatchoosehookprocaFn {
    public operator fun invoke(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): UInt
}

public typealias Acmformatchoosehookproca = AcmformatchoosehookprocaFn?

public fun interface AcmformatchoosehookprocwFn {
    public operator fun invoke(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): UInt
}

public typealias Acmformatchoosehookprocw = AcmformatchoosehookprocwFn?

public fun interface AcmformatenumcbaFn {
    public operator fun invoke(hadid: Hacmdriverid, pafd: MutPtr<Acmformatdetailsa>, dwinstance: ULong, fdwsupport: UInt): Bool
}

public typealias Acmformatenumcba = AcmformatenumcbaFn?

public fun interface AcmformatenumcbwFn {
    public operator fun invoke(hadid: Hacmdriverid, pafd: MutPtr<TAcmformatdetailsw>, dwinstance: ULong, fdwsupport: UInt): Bool
}

public typealias Acmformatenumcbw = AcmformatenumcbwFn?

public fun interface AcmformattagenumcbaFn {
    public operator fun invoke(hadid: Hacmdriverid, paftd: MutPtr<Acmformattagdetailsa>, dwinstance: ULong, fdwsupport: UInt): Bool
}

public typealias Acmformattagenumcba = AcmformattagenumcbaFn?

public fun interface AcmformattagenumcbwFn {
    public operator fun invoke(hadid: Hacmdriverid, paftd: MutPtr<Acmformattagdetailsw>, dwinstance: ULong, fdwsupport: UInt): Bool
}

public typealias Acmformattagenumcbw = AcmformattagenumcbwFn?

public typealias AmbisonicsChannelOrdering = Int

public typealias AmbisonicsNormalization = Int

public typealias AmbisonicsType = Int

public typealias AudclntSharemode = Int

public typealias AudclntStreamoptions = Int

public typealias AudioclientActivationType = Int

public typealias AudioDuckingOptions = Int

public typealias AudioEffectState = Int

public typealias AudioStreamCategory = Int

public typealias AudioSystemeffectsPropertystoreType = Int

public typealias AudioObjectType = Int

public typealias AudioSessionDisconnectReason = Int

public typealias AudioSessionState = Int

public typealias AudioStateMonitorSoundLevel = Int

public typealias DeviceState = UInt

public typealias DataFlow = Int

public typealias EDataFlow = Int

public typealias ERole = Int

public typealias EndpointFormFactor = Int

public typealias Hacmdriver = MutPtr<CVoid>

public typealias Hacmdriverid = MutPtr<CVoid>

public typealias Hacmobj = MutPtr<CVoid>

public typealias Hacmstream = MutPtr<CVoid>

public typealias Hmidi = MutPtr<CVoid>

public typealias Hmidiin = MutPtr<CVoid>

public typealias Hmidiout = MutPtr<CVoid>

public typealias Hmidistrm = MutPtr<CVoid>

public typealias Hmixer = MutPtr<CVoid>

public typealias Hmixerobj = MutPtr<CVoid>

public typealias Hwave = MutPtr<CVoid>

public typealias Hwavein = MutPtr<CVoid>

public typealias Hwaveout = MutPtr<CVoid>

public fun interface LpacmdriverprocFn {
    public operator fun invoke(param0: ULong, param1: Hacmdriverid, param2: UInt, param3: Lparam, param4: Lparam): Lresult
}

public typealias Lpacmdriverproc = LpacmdriverprocFn?

public fun interface LpmidicallbackFn {
    public operator fun invoke(hdrvr: Hdrvr, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias Lpmidicallback = LpmidicallbackFn?

public fun interface LpwavecallbackFn {
    public operator fun invoke(hdrvr: Hdrvr, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias Lpwavecallback = LpwavecallbackFn?

public typealias MidiWaveOpenType = UInt

public typealias MixerlineComponenttype = UInt

public fun interface PAudioStateMonitorCallbackFn {
    public operator fun invoke(audiostatemonitor: MutPtr<CVoid>, context: ConstPtr<CVoid>)
}

public typealias PAudioStateMonitorCallback = PAudioStateMonitorCallbackFn?

public typealias ProcessLoopbackMode = Int

public typealias PartType = Int

public typealias SndFlags = UInt

public typealias SpatialAudioStreamOptions = Int

public typealias SpatialAudioHrtfDirectivityType = Int

public typealias SpatialAudioHrtfDistanceDecayType = Int

public typealias SpatialAudioHrtfEnvironmentType = Int

public typealias SpatialAudioMetadataCopyMode = Int

public typealias SpatialAudioMetadataWriterOverflowMode = Int

public typealias AudclntBufferflags = Int
