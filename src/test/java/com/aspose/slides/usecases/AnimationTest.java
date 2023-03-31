// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ShapeTests.cs">
//   Copyright (c) 2018 Aspose.Slides for Cloud
// </copyright>
// <summary>
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
// 
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
// 
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * API tests for animation
 */
public class AnimationTest extends ApiTest {
    @Test
    public void animationGetTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Shape dto = new Shape();
        dto.setShapeType(GeometryShape.ShapeTypeEnum.CALLOUT1);
        SlideAnimation animation = api.getAnimation(fileName, c_slideIndex, null, null, password, folderName, null);
        assertEquals(c_effectCount, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount, animation.getInteractiveSequences().size());
        animation = api.getAnimation(fileName, c_slideIndex, 3, null, password, folderName, null);
        assertEquals(1, animation.getMainSequence().size());
        assertEquals(0, animation.getInteractiveSequences().size());
        animation = api.getAnimation(fileName, c_slideIndex, 3, 1, password, folderName, null);
        assertEquals(0, animation.getMainSequence().size());
    }

    @Test
    public void animationSetTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideAnimation dto = new SlideAnimation();
        List<Effect> effects = new ArrayList<Effect>();

        Effect effect1 = new Effect();
        effect1.setType(Effect.TypeEnum.BLINK);
        effect1.setShapeIndex(2);
        effect1.setParagraphIndex(1);
        effects.add(effect1);

        Effect effect2 = new Effect();
        effect2.setType(Effect.TypeEnum.BOX);
        effect2.setSubtype(Effect.SubtypeEnum.IN);
        effect2.setPresetClassType(Effect.PresetClassTypeEnum.ENTRANCE);
        effect2.setShapeIndex(4);
        effects.add(effect2);
        dto.setMainSequence(effects);
        dto.setInteractiveSequences(new ArrayList<InteractiveSequence>());
        SlideAnimation animation = api.setAnimation(fileName, c_slideIndex, dto, password, folderName, null);
        assertEquals(dto.getMainSequence().size(), animation.getMainSequence().size());
        assertEquals(0, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationCreateEffectTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Effect dto = new Effect();
        dto.setType(Effect.TypeEnum.BLAST);
        dto.setShapeIndex(3);
        SlideAnimation animation = api.createAnimationEffect(fileName, c_slideIndex, dto, password, folderName, null);
        assertEquals(c_effectCount + 1, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationCreateInteractiveSequenceTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        InteractiveSequence dto = new InteractiveSequence();
        dto.setTriggerShapeIndex(2);
        List<Effect> effects = new ArrayList<Effect>();
        Effect effect = new Effect();
        effect.setType(Effect.TypeEnum.BLAST);
        effect.setShapeIndex(3);
        effects.add(effect);
        dto.setEffects(effects);
        SlideAnimation animation = api.createAnimationInteractiveSequence(fileName, c_slideIndex, dto, password, folderName, null);
        assertEquals(c_effectCount, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount + 1, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationCreateInteractiveSequenceEffectTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Effect dto = new Effect();
        dto.setType(Effect.TypeEnum.BLAST);
        dto.setShapeIndex(3);
        SlideAnimation animation = api.createAnimationInteractiveSequenceEffect(fileName, c_slideIndex, 1, dto, password, folderName, null);
        assertEquals(c_effectCount, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationUpdateEffectTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Effect dto = new Effect();
        dto.setType(Effect.TypeEnum.BLAST);
        dto.setShapeIndex(3);
        SlideAnimation animation = api.updateAnimationEffect(fileName, c_slideIndex, 1, dto, password, folderName, null);
        assertEquals(c_effectCount, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationUpdateInteractiveSequenceEffectTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        Effect dto = new Effect();
        dto.setType(Effect.TypeEnum.BLAST);
        dto.setShapeIndex(3);
        SlideAnimation animation = api.updateAnimationInteractiveSequenceEffect(fileName, c_slideIndex, 1, 1, dto, password, folderName, null);
        assertEquals(c_effectCount, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationDeleteTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideAnimation animation = api.deleteAnimation(fileName, c_slideIndex, password, folderName, null);
        assertEquals(0, animation.getMainSequence().size());
        assertEquals(0, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationDeleteMainSequenceTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideAnimation animation = api.deleteAnimationMainSequence(fileName, c_slideIndex, password, folderName, null);
        assertEquals(0, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationDeleteMainSequenceEffectTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideAnimation animation = api.deleteAnimationEffect(fileName, c_slideIndex, 1, password, folderName, null);
        assertEquals(c_effectCount - 1, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationDeleteInteractiveSequencesTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideAnimation animation = api.deleteAnimationInteractiveSequences(fileName, c_slideIndex, password, folderName, null);
        assertEquals(c_effectCount, animation.getMainSequence().size());
        assertEquals(0, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationDeleteInteractiveSequenceTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideAnimation animation = api.deleteAnimationInteractiveSequence(fileName, c_slideIndex, 1, password, folderName, null);
        assertEquals(c_effectCount, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount - 1, animation.getInteractiveSequences().size());
    }

    @Test
    public void animationDeleteInteractiveSequenceEffectTest() throws ApiException, IOException {
        api.copyFile(tempFolderName + "/" + fileName, folderName + "/" + fileName, null, null, null);
        SlideAnimation animation = api.deleteAnimationInteractiveSequenceEffect(fileName, c_slideIndex, 1, 1, password, folderName, null);
        assertEquals(c_effectCount, animation.getMainSequence().size());
        assertEquals(c_interactiveSequenceCount, animation.getInteractiveSequences().size());
    }

    private final int c_slideIndex = 1;
    private final int c_effectCount = 1;
    private final int c_interactiveSequenceCount = 1;
}
