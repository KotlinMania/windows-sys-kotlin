package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val GID_BEGIN: GestureconfigId = 1u

public val GID_END: GestureconfigId = 2u

public val GID_PAN: GestureconfigId = 4u

public val GID_PRESSANDTAP: GestureconfigId = 7u

public val GID_ROLLOVER: GestureconfigId = 7u

public val GID_ROTATE: GestureconfigId = 5u

public val GID_TWOFINGERTAP: GestureconfigId = 6u

public val GID_ZOOM: GestureconfigId = 3u

public val MANIPULATION_ALL: ManipulationProcessorManipulations = 15

public val MANIPULATION_NONE: ManipulationProcessorManipulations = 0

public val MANIPULATION_ROTATE: ManipulationProcessorManipulations = 8

public val MANIPULATION_SCALE: ManipulationProcessorManipulations = 4

public val MANIPULATION_TRANSLATE_X: ManipulationProcessorManipulations = 1

public val MANIPULATION_TRANSLATE_Y: ManipulationProcessorManipulations = 2

public val TOUCHEVENTF_DOWN: ToucheventfFlags = 2u

public val TOUCHEVENTF_INRANGE: ToucheventfFlags = 8u

public val TOUCHEVENTF_MOVE: ToucheventfFlags = 1u

public val TOUCHEVENTF_NOCOALESCE: ToucheventfFlags = 32u

public val TOUCHEVENTF_PALM: ToucheventfFlags = 128u

public val TOUCHEVENTF_PEN: ToucheventfFlags = 64u

public val TOUCHEVENTF_PRIMARY: ToucheventfFlags = 16u

public val TOUCHEVENTF_UP: ToucheventfFlags = 4u

public val TOUCHINPUTMASKF_CONTACTAREA: TouchinputmaskfMask = 4u

public val TOUCHINPUTMASKF_EXTRAINFO: TouchinputmaskfMask = 2u

public val TOUCHINPUTMASKF_TIMEFROMSYSTEM: TouchinputmaskfMask = 1u

public val TWF_FINETOUCH: RegisterTouchWindowFlags = 1u

public val TWF_WANTPALM: RegisterTouchWindowFlags = 2u

public val INERTIA_PROCESSOR: Guid = Guid.fromU128(U128(0xabb270874ce04e58uL, 0xa0cbe24df96814beuL))

public val MANIPULATION_PROCESSOR: Guid = Guid.fromU128(U128(0x597d4fb047fd4affuL, 0x89b9c6cfae8cf08euL))
